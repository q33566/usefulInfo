package application;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;

public class MyRadioButton {
	RadioButton button1 = new RadioButton("會!");
	RadioButton button2 = new RadioButton("不會!");
	ToggleGroup group = new ToggleGroup();
	
	MyRadioButton(){
		button1.setLayoutX(380);
		button1.setLayoutY(320);
		button1.setFont(new Font(20));
		button1.setToggleGroup(group);
		button2.setLayoutX(490);
		button2.setLayoutY(320);
		button2.setFont(new Font(20));
		button2.setToggleGroup(group);
	}
}
