package org.example.projectt;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.SQLException;
import dao.SongDAO;
import model.Song;

public class MainView {

    @FXML private TableView<Song> tableView;
    @FXML private TableColumn<Song, String> titleColumn;
    @FXML private TableColumn<Song, String> genreColumn;
    @FXML private TableColumn<Song, Integer> yearColumn;

    private SongDAO songDAO;

    public MainView() {
        songDAO = new SongDAO();
    }

    @FXML
    private void initialize() {
        // Initialize table columns
        titleColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTitle()));
        genreColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getGenre()));
        yearColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getReleaseYear()).asObject());

        // Load data into the table
        try {
            ObservableList<Song> songList = FXCollections.observableArrayList(songDAO.getAllSongs());
            tableView.setItems(songList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void addSong() {
        // Add a new song (implement your logic here)
    }

    @FXML
    private void deleteSong() {
        // Delete the selected song (implement your logic here)
    }

    @FXML
    private void refreshData() {
        // Refresh the song data in the table
        try {
            ObservableList<Song> songList = FXCollections.observableArrayList(songDAO.getAllSongs());
            tableView.setItems(songList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
