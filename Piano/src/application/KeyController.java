package application;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javax.sound.midi.*;

public class KeyController {

	private EventHandler originalEvent;

	@FXML
	public Pane FullNoteLabelPane;
	public Pane HalfNoteLabelPane;

	public Button keyC;
	public Button keyDFlat;
	public Button keyD;
	public Button keyEFlat;
	public Button keyE;
	public Button keyF;
	public Button keyGFlat;
	public Button keyG;
	public Button keyAFlat;
	public Button keyA;
	public Button keyHFlat;
	public Button keyH;
	public Button keyC2;

	public Button[] pianoKeys = {keyC, keyDFlat, keyD, keyEFlat, keyE, keyF, keyGFlat, keyG, keyAFlat, keyA, keyHFlat, keyC2};

    //private Node parent = cLabel.getParent();

	@FXML
	/**
	 * Spielt Ton der Taste
	 * @param event
	 */
	public void playNote(MouseEvent event) throws MidiUnavailableException{

        //cLabel.setVisible(false);
		Button x = (Button) event.getSource();
		mySequencer ms = new mySequencer();

		if(x.getId().equals("keyC")){
			ms.setMySequence(fileLocations.getLocation(0));
		}
		else if(x.getId().equals("keyDFlat")){
			ms.setMySequence(fileLocations.getLocation(1));
		}
		else if(x.getId().equals("keyD")){
			ms.setMySequence(fileLocations.getLocation(2));
		}
        else if(x.getId().equals("keyEFlat")){
            ms.setMySequence(fileLocations.getLocation(3));
        }
		else if(x.getId().equals("keyE")){
			ms.setMySequence(fileLocations.getLocation(4));
		}
		else if(x.getId().equals("keyF")){
			ms.setMySequence(fileLocations.getLocation(5));
		}
        else if(x.getId().equals("keyGFlat")){
            ms.setMySequence(fileLocations.getLocation(6));
        }
		else if(x.getId().equals("keyG")){
			ms.setMySequence(fileLocations.getLocation(7));
		}
        else if(x.getId().equals("keyAFlat")){
            ms.setMySequence(fileLocations.getLocation(8));
        }
		else if(x.getId().equals("keyA")){
			ms.setMySequence(fileLocations.getLocation(9));
		}
        else if(x.getId().equals("keyHFlat")){
            ms.setMySequence(fileLocations.getLocation(10));
        }
		else if(x.getId().equals("keyH")){
			ms.setMySequence(fileLocations.getLocation(11));
		}
		else if(x.getId().equals("keyC2")) {
            ms.setMySequence(fileLocations.getLocation(12));
        }
	}

	@FXML
	/**
	 * Ändert die Sichtbarkeit der Notennamen
	 * @see #displayFullNoteLabels()
	 * @see #displayHalfNoteLabels()
	 */
	public void changeLabelVisibility(){
		displayHalfNoteLabels();
		displayFullNoteLabels();
	}

    public void displayFullNoteLabels(){
        if(!(FullNoteLabelPane.isVisible())){
			FullNoteLabelPane.setVisible(true);
		}
		else{
			FullNoteLabelPane.setVisible(false);
		}
    }

    public void displayHalfNoteLabels(){
		if(!(HalfNoteLabelPane.isVisible())){
			HalfNoteLabelPane.setVisible(true);
		}
		else{
			HalfNoteLabelPane.setVisible(false);
		}
	}

	@FXML
	public void changeOnMouseRelease(){
		for(Button b : pianoKeys) {
			if (getOriginalEvent() == null) {
				setOriginalEvent(b.getOnMouseReleased());
			}
			if (getOriginalEvent() == b.getOnMouseReleased()) {
				b.setOnMouseReleased(event -> {
					System.out.println("Mouserelease-Event empty \n");
				});
			} else b.setOnMouseReleased(getOriginalEvent());
		}
	}

	private void setOriginalEvent(EventHandler originalEvent){
		this.originalEvent = originalEvent;
	}

	private EventHandler getOriginalEvent(){
		return this.originalEvent;
	}

	@FXML
	/**
	 * Beenden des Tons
	 * @param event
	 */
	public void stopNote() throws MidiUnavailableException {

			if (mySequencer.getMySequencer().isRunning()) {
				mySequencer.getMySequencer().stop();
				mySequencer.getMySequencer().close();
			}
	}
}
