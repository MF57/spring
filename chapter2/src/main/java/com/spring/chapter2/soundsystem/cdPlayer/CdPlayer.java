package com.spring.chapter2.soundsystem.cdPlayer;

import com.spring.chapter2.soundsystem.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mf57 on 07.04.2016.
 */
@Component
public class CdPlayer {

    private CompactDisc cd;

    @Autowired
    public CdPlayer(CompactDisc cd) {
        this.cd = cd;
    }
}
