package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    private List<String> songList = new ArrayList<>();

    //@Autowired
    ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method is invoked");
        return new ClassicalMusic();
    }

    @Override
    public List<String> getSongs() {
        return addClassicalSong();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    private List<String> addClassicalSong() {
        songList.add("Классическая песня 1");
        songList.add("Классическая песня 2");
        songList.add("Классическая песня 3");
        return songList;
    }
}
