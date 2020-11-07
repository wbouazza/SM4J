package Simo.SM4J;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import shopfloor.*;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {
		var javaVersion = SystemInfo.javaVersion();
		var javafxVersion = SystemInfo.javafxVersion();
		var label = new Label("Hello, JavaFX application " + javafxVersion + ", running on Java " + javaVersion + ".");
		var scene = new Scene(new StackPane(label), 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// launch();
		System.out.println("App.java: Hello world! ");
		
		Cell cell1 = new Cell(1,"C1");
		cell1.machines.add(new Machine(1,"m1", 3, 3, 0));

		Cell cell2 = new Cell(2,"C2");
		cell2.machines.add(new Machine(2,"m2", 3, 3, 0));
		cell2.machines.add(new Machine(3,"m3", 3, 3, 0));
		
		Factory usine = new Factory(1,"F1");
		usine.cells.add(cell1);
		
		usine.cells.add(cell2);
		usine.init();
		
		usine.sayMe(false, false);

	}

}