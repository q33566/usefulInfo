package application;

import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;

public class MyCheckBox {
	CheckBox checkBox = new CheckBox("請問這是貓嗎?");
	MyCheckBox(){
		checkBox.setLayoutX(370);
		checkBox.setLayoutY(170);
		checkBox.setFont(new Font(30));
	}
}
