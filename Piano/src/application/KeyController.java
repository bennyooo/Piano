package application;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;


public class KeyController {

	@FXML
	private Text tFeld;

	@FXML
	private void playNote(ActionEvent event){

		Button x = (Button) event.getSource();

		if(x.getId().equals("keyC")){
			Thread t1 = new Thread (new playSequenceCommand(fileLocations.getLocation(0)));
			t1.start();
			tFeld.setText("Taste C gedrückt! ");
		}
		else if(x.getId().equals("keyD")){
			Thread t2 = new Thread (new playSequenceCommand(fileLocations.getLocation(1)));
			t2.start();
			tFeld.setText("Taste D gedrückt!");
		}
		else if(x.getId().equals("keyE")){
			Thread t3 = new Thread (new playSequenceCommand(fileLocations.getLocation(2)));
			t3.start();
			tFeld.setText("Taste E gedrückt!");
		}
		else if(x.getId().equals("keyF")){
			Thread t4 = new Thread (new playSequenceCommand(fileLocations.getLocation(3)));
			t4.start();
			tFeld.setText("Taste F gedrückt!");
		}
		else if(x.getId().equals("keyG")){
			Thread t5 = new Thread (new playSequenceCommand(fileLocations.getLocation(4)));
			t5.start();
			tFeld.setText("Taste G gedrückt!");
		}
		else if(x.getId().equals("keyA")){
			Thread t6 = new Thread (new playSequenceCommand(fileLocations.getLocation(5)));
			t6.start();
			tFeld.setText("Taste A gedrückt!");
		}
		else if(x.getId().equals("keyH")){
			Thread t7 = new Thread (new playSequenceCommand(fileLocations.getLocation(6)));
			t7.start();
			tFeld.setText("Taste H gedrückt!");
		}
		else if(x.getId().equals("keyC2")){
			Thread t8 = new Thread (new playSequenceCommand(fileLocations.getLocation(7)));
			t8.start();
			tFeld.setText("Taste C2 gedrückt!");
		}
		else tFeld.setText("Unbekannte Taste gedrückt");
	}
}
