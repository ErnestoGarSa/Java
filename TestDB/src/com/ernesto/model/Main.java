package com.ernesto.model;

import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        DataSource dataSource = new DataSource();
        if (!dataSource.open()) {
            System.out.println("Can´t open datasource");
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_NONE);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + " , Name = " + artist.getName());
        }

        List<String> albumsForArtist = dataSource.queryAlbumForArtist("Carole King", DataSource.ORDER_BY_DESC);
        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("She's On Fire", DataSource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn´t find the artist for the song");
            return;
        }
        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() + " Album name = " + artist.getAlbumName() + " Track = " + artist.getTrack());
        }

        dataSource.querySongsMetadata();

        int count = dataSource.getCount(DataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        dataSource.createViewForSongArtist();


        songArtists = dataSource.querySongInfoView("She's On Fire");
        if (songArtists.isEmpty()) {
            System.out.println("Couldn´t find the artist for the songs");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        songArtists = dataSource.InyectionQuerySongInfoView("Go Your Own Way");
        if (songArtists.isEmpty()) {
            System.out.println("Couldn´t find the artist for the songs");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        //dataSource.insertSong("Touch Of Grey", "Grateful Dead", "In The Dark", 1);
        dataSource.insertSong("Touch Of Grey", "Grateful Dead", "In The Moon", 1);


        dataSource.close();
    }
}
