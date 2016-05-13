package application;

import javafx.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;

import javax.sound.midi.*;

public class KeyController {

	public Sequencer initializeSequencer(String location){

		String jLocation = location.replace("\\", "/");
		try{
			Sequencer sq = MidiSystem.getSequencer();
			InputStream midiFile = new BufferedInputStream(new FileInputStream(jLocation));

			sq.open();
			sq.setSequence(midiFile);
			return sq;
		}
		catch(MidiUnavailableException e){
			e.printStackTrace();
			return null;
		}
		catch (InvalidMidiDataException e) {
			e.printStackTrace();
			return null;
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@FXML
	private Text tFeld;

	@FXML
	private void playNote(ActionEvent event){

		Button x = (Button) event.getSource();

		if(x.getId().equals("keyC")){
			tFeld.setText("Taste C gedrückt!");
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\c1.mid");
			seq.start();
		}
		else if(x.getId().equals("keyD")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\d.mid");
			seq.start();
			tFeld.setText("Taste D gedrückt!");
		}
		else if(x.getId().equals("keyE")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\e.mid");
			seq.start();
			tFeld.setText("Taste E gedrückt!");
		}
		else if(x.getId().equals("keyF")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\f.mid");
			seq.start();
			tFeld.setText("Taste F gedrückt!");
		}
		else if(x.getId().equals("keyG")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\g.mid");
			seq.start();
			tFeld.setText("Taste G gedrückt!");
		}
		else if(x.getId().equals("keyA")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\a.mid");
			seq.start();
			tFeld.setText("Taste A gedrückt!");
		}
		else if(x.getId().equals("keyH")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\b.mid");
			seq.start();
			tFeld.setText("Taste H gedrückt!");
		}
		else if(x.getId().equals("keyC2")){
			Sequencer seq = initializeSequencer("C:\\Users\\Benjamin\\Downloads\\notes\\c2.mid");
			seq.start();
			tFeld.setText("Taste C2 gedrückt!");
		}
		else tFeld.setText("Unbekannte Taste gedrückt");
	}
}
