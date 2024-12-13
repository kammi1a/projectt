package org.example.projectt;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SongDAO {
    public List<Song> getAllSongs() throws SQLException {
        List<Song> songs = new ArrayList<>();
        String query = "SELECT * FROM Song";
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Song song = new Song(
                        rs.getInt("song_id"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getTime("duration"),
                        rs.getInt("release_year")
                );
                songs.add(song);
            }
        }
        return songs;
    }

    public void addSong(Song song) throws SQLException {
        String query = "INSERT INTO Song (title, genre, duration, release_year) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, song.getTitle());
            pstmt.setString(2, song.getGenre());
            pstmt.setTime(3, song.getDuration());
            pstmt.setInt(4, song.getReleaseYear());
            pstmt.executeUpdate();
        }
    }

    public void deleteSong(int songId) throws SQLException {
        String query = "DELETE FROM Song WHERE song_id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, songId);
            pstmt.executeUpdate();
        }
    }
}
