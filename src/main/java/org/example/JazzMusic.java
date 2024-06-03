package org.example;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    private List<String> songList = new ArrayList<>();

    @Override
    public List<String> getSongs() {
        return addSong();
    }

    private List<String> addSong() {
        songList.add("Jazz песня 1");
        songList.add("Jazz песня 2");
        songList.add("Jazz песня 3");
        return songList;
    }
}
