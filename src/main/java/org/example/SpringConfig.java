package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;


@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    List<Object> musicList() {
        List<Object> list = new ArrayList<>();
        list.add(classicalMusic());
        list.add(rockMusic());
        list.add(jazzMusic());
        return list;
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
