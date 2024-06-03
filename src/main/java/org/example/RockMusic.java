package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {

    private List<String> songList = new ArrayList<>();

//    @Autowired
    public RockMusic() {
    }

    @Override
    public List<String> getSongs() {
        return addSong();
    }



    private List<String> addSong() {
        songList.add("Rock песня 1");
        songList.add("Rock песня 2");
        songList.add("Rock песня 3");
        return songList;
    }
}
