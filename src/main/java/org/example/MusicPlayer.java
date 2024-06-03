package org.example;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Object> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private ClassicalMusic classicalMusic = new ClassicalMusic();
    private RockMusic rockMusic = new RockMusic();
    private JazzMusic jazzMusic = new JazzMusic();

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
//       this.music1 = music1;
//       this.music2 = music2;
//    }

    public MusicPlayer(List<Object> musicList) {
       this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
    }


    public String playMusic() {
        String song = null;
        String className = musicList.get(new Random().nextInt(musicList.size())).getClass().getName();
       switch (className) {
           case ("org.example.ClassicalMusic") :
               song = classicalMusic.getSongs().get(new Random().nextInt(classicalMusic.getSongs().size()));
               break;
           case ("org.example.RockMusic") :
               song = rockMusic.getSongs().get(new Random().nextInt(rockMusic.getSongs().size()));
               break;
           case ("org.example.JazzMusic") :
               song = jazzMusic.getSongs().get(new Random().nextInt(jazzMusic.getSongs().size()));
               break;
       }
        return song;
    }
}
