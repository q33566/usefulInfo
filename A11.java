//Assignment 11
//Name: 沈哲寬
//ID: 111502036
//Course: 2023-CE1002-B
package application;
	

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			Circle circle = new Circle(100);
			circle.setCenterX(250);
			circle.setCenterY(250);
			Rectangle rect = new Rectangle();
			rect.setX(480);
			rect.setY(220);
			rect.setWidth(60);
			rect.setHeight(20);
			
			FadeTransition fadeTransition = new FadeTransition();
			fadeTransition.setDuration(Duration.seconds(2));
			fadeTransition.setNode(rect);
			fadeTransition.setFromValue(1); 	//從透明度100
			fadeTransition.setToValue(0.3);		//到透明度0
			fadeTransition.setAutoReverse(true);
			fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
			fadeTransition.play();
			
			PathTransition transition = new PathTransition();
			transition.setDuration(Duration.seconds(1));//動畫執行週期:4秒
			transition.setPath(circle);//動畫執行路徑
			transition.setNode(rect);//動畫物件
			transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);//物件垂直切線移動
			transition.setCycleCount(PathTransition.INDEFINITE);//動畫次數
			transition.play();
			
		
			Timeline timeline = new Timeline(new KeyFrame(Duration.millis(3000), new EventHandler<ActionEvent>() {
				@Override										//3秒刷新一次
				public void handle(ActionEvent event) {
					transition.stop();
					if(transition.getDuration().equals(Duration.seconds(1))) {
						transition.setDuration(Duration.seconds(3));
					}else {
						transition.setDuration(Duration.seconds(1));
					}
					transition.play();
				}
			}));

			timeline.setCycleCount(Timeline.INDEFINITE);
			timeline.play();
			
			BorderPane borderpane = new BorderPane();
			borderpane.getChildren().add(rect); 	//把rect加入pane
			Label label = new Label("111502036");   //顯示學號
			borderpane.setTop(label);
			Scene scene = new Scene(borderpane,500,500);
			primaryStage.setTitle("A11");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
