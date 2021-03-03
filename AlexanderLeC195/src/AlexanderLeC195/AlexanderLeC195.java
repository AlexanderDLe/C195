package AlexanderLeC195;

import AlexanderLeC195.Database.DatabaseConnector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

public class AlexanderLeC195 extends Application {
    public static Connection databaseConnector;

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println("Starting Application...");
        Parent root = FXMLLoader.load(getClass().getResource("ViewController/Login.fxml"));
        primaryStage.setTitle("Appointment Application");

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        databaseConnector = DatabaseConnector.connectDatabase();
        launch(args);
    }
}
