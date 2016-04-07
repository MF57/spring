package com.spring.chapter2.soundsystem.cd;

import org.springframework.stereotype.Component;

/**
 * Created by mf57 on 07.04.2016.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
}
