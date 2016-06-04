package application;

import javax.sound.midi.*;
import java.awt.event.ActionEvent;
import java.io.*;

/**
 * Created by Benjamin on 30.05.2016.
 */
class mySequencer{

    private String jLocation;
    private static Sequencer sq;

    /**
     * Sequencer muss static sein um Verzögerungen zu unterbinden
     */
    static {
        try {
            sq = MidiSystem.getSequencer();
        }
        catch (MidiUnavailableException e){
            e.printStackTrace();
        }
    }

    private InputStream midiFile = null;

    public mySequencer() throws MidiUnavailableException {
    }

    public static Sequencer getMySequencer(){
        return sq;
    }


    public void setMySequence(String location){
        try {
            this.jLocation = location.replace("\\", "/");
            this.midiFile = new BufferedInputStream(new FileInputStream(jLocation));
            getMySequencer().open();
            getMySequencer().setSequence(midiFile);
            playSequence(this.sq);
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        catch (MidiUnavailableException e){
            e.printStackTrace();
        }
    }

    public void playSequence(Sequencer sequencer){
        sequencer.start();
    }

    public void stopSequence(Sequencer sequencer){
        sequencer.stop();
    }
}
