package application;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class playSequenceCommand implements Runnable{
	private String jLocation;

	playSequenceCommand(String location){
		this.jLocation=location.replace("\\", "/");
	}

	@Override
	public void run() {

		try{
			Sequencer sq = MidiSystem.getSequencer();
			InputStream midiFile = new BufferedInputStream(new FileInputStream(jLocation));

			sq.open();
			sq.setSequence(midiFile);
			sq.start();
			if (!(sq.isRunning())){
				sq.stop();
				sq.close();
			}
		}
		catch(MidiUnavailableException e){
			e.printStackTrace();
		}
		catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

