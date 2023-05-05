package application;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class MyLabel {
	Label label1 = new Label();
	Label label2 = new Label();
	
	MyLabel(){
		label1.setText("A POP CAT!!");
		label1.setLayoutX(330);
		label1.setLayoutY(70);
		label1.setFont(new Font(50));
		label2.setText("他的嘴巴會張開嗎?");
		label2.setLayoutX(315);
		label2.setLayoutY(230);
		label2.setFont(new Font(40));
	}
}
