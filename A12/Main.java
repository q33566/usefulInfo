//Assignment 12
//Name: 沈哲寬
//ID: 111502036
//Course: 2023-CE1002-B
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			MyScene scene = new MyScene();
			stage.setScene(scene.scene);
			stage.setTitle("Hello World");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
