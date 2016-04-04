package com.spring1.knight;

import com.spring1.quest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;


/**
 * Created by mf57 on 04.04.2016.
 */
public class BraveKnightTest {

    @Test
    public void embarkOnQuest() throws Exception {

        Quest quest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(quest);

        knight.embarkOnQuest();

        verify(quest, times(1)).embark();

    }
}