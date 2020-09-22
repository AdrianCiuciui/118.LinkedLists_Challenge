package com.company;

import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList <Song> listOfSongs;

    public Album(String name, LinkedList<Song> listOfSongs) {
        this.name = name;
        this.listOfSongs = listOfSongs;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void addSongToAlbum (Song songToBeAdded) {
        listOfSongs.add(songToBeAdded);
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", listOfSongs=" + listOfSongs +
                '}';
    }
}
