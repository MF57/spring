package com.spring.chapter2;

import com.spring.chapter2.config.CDPlayerConfig;
import com.spring.chapter2.soundsystem.cd.CompactDisc;
import com.spring.chapter2.soundsystem.cdPlayer.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by mf57 on 07.04.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerJavaTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    MediaPlayer player;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void cdShouldNotBeNull() throws Exception {
        assertNotNull(cd);
    }

    @Test
    public void testPlay() throws Exception {
        player.play();
        assertEquals(
                "Playing song: Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                log.getLog()
        );

    }
}
