package org.example.projectt;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class MusicPlaylistApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML layout
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        // Set the title and scene of the primary stage
        primaryStage.setTitle("Music Playlist Management System");
        primaryStage.setScene(scene);

        // Show the primary stage (window)
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
