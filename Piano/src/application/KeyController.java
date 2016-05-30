package application;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import javax.sound.midi.*;

public class KeyController {

	@FXML
	private Text tFeld;

	@FXML
	/**
	 * Spielt Ton der Taste
	 * @param event
	 */
	private void playNote(MouseEvent event) throws MidiUnavailableException{

		Button x = (Button) event.getSource();
		mySequencer ms = new mySequencer();

		if(x.getId().equals("keyC")){
			ms.setMySequence(fileLocations.getLocation(0));
		}
		else if(x.getId().equals("keyD")){
			ms.setMySequence(fileLocations.getLocation(1));
		}
		else if(x.getId().equals("keyE")){
			ms.setMySequence(fileLocations.getLocation(2));
		}
		else if(x.getId().equals("keyF")){
			ms.setMySequence(fileLocations.getLocation(3));
		}
		else if(x.getId().equals("keyG")){
			ms.setMySequence(fileLocations.getLocation(4));
		}
		else if(x.getId().equals("keyA")){
			ms.setMySequence(fileLocations.getLocation(5));
		}
		else if(x.getId().equals("keyH")){
			ms.setMySequence(fileLocations.getLocation(6));
		}
		else if(x.getId().equals("keyC2")){
			ms.setMySequence(fileLocations.getLocation(7));
		}
		else tFeld.setText("Unbekannte Taste gedrueckt");
	}
	@FXML
	/**
	 * Beenden des Tons
	 * @param event
	 */
	private void stopNote() throws MidiUnavailableException {

			if (mySequencer.getMySequencer().isRunning()) {
				mySequencer.getMySequencer().stop();
				mySequencer.getMySequencer().close();
			}
	}
}
