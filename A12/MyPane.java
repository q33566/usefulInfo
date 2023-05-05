package application;

import javafx.scene.layout.Pane;

public class MyPane {
	MyLabel myLabel = new MyLabel();
	MyImage myImage = new MyImage(); 
	MyButton button = new MyButton(myImage);
	MyRadioButton myButton = new MyRadioButton();
	Pane root = new Pane();
	MyPane(){
		root.getChildren().add(myImage.iv);
		root.getChildren().add(myLabel.label1);
		root.getChildren().add(myLabel.label2);
		root.getChildren().add(new MyCheckBox().checkBox);
		root.getChildren().addAll(myButton.button1,myButton.button2);
		root.getChildren().add(button.button);
	}
}
