package com.spring.chapter2;

import com.spring.chapter2.config.CDPlayerConfig;
import com.spring.chapter2.soundsystem.CompactDisc;
import org.junit.Test;
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

    @Test
    public void cdShouldNotBeNull() throws Exception {
        assertNotNull(cd);

    }
}
