package application;

import javafx.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import javax.sound.midi.*;

public class KeyController {

	@FXML
	private Text tFeld;

	@FXML
	private void playNote(ActionEvent event){

		Button x = (Button) event.getSource();

		if(x.getId().equals("keyC")){
			Thread t1 = new Thread (new playSequenceCommand(fileLocations.getLocation(0)));
			tFeld.setText("Taste C gedr�ckt!");
		}
		else if(x.getId().equals("keyD")){
			//playSequence(fileLocations.getLocation(1));
			tFeld.setText("Taste D gedr�ckt!");
		}
		else if(x.getId().equals("keyE")){
			//playSequence(fileLocations.getLocation(2));
			tFeld.setText("Taste E gedr�ckt!");
		}
		else if(x.getId().equals("keyF")){
			//playSequence(fileLocations.getLocation(3));
			tFeld.setText("Taste F gedr�ckt!");
		}
		else if(x.getId().equals("keyG")){
			//playSequence(fileLocations.getLocation(4));
			tFeld.setText("Taste G gedr�ckt!");
		}
		else if(x.getId().equals("keyA")){
			//playSequence(fileLocations.getLocation(5));
			tFeld.setText("Taste A gedr�ckt!");
		}
		else if(x.getId().equals("keyH")){
			//playSequence(fileLocations.getLocation(6));
			tFeld.setText("Taste H gedr�ckt!");
		}
		else if(x.getId().equals("keyC2")){
			//playSequence(fileLocations.getLocation(7));
			tFeld.setText("Taste C2 gedr�ckt!");
		}
		else tFeld.setText("Unbekannte Taste gedr�ckt");
	}
}
