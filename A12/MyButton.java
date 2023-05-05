package application;

import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class MyButton {
	Button button = new Button("POP!!");
	MyButton(MyImage myImage){
		button.setLayoutX(240);
		button.setLayoutY(390);
		button.setFont(new Font(40));
		button.setOnAction(e->{
			myImage.pop();
		});
	}
}
