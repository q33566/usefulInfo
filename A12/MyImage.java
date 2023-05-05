package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyImage{
	Image popCatOpen = new Image(getClass().getResourceAsStream("popCatOpen.png"));
	Image popCatClose = new Image(getClass().getResourceAsStream("popCatClose.png"));
	ImageView iv = new ImageView();
	MyImage(){
		iv.setImage(popCatClose);
		iv.setFitWidth(200);
		iv.setFitHeight(200);
		iv.setX(50);
		iv.setY(150);
	}
	public void pop() {
		if(iv.getImage()==popCatClose) {
			iv.setImage(popCatOpen);
		}else {
			iv.setImage(popCatClose);
		}
	}
}
