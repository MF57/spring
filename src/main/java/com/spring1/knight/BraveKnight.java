package com.spring1.knight;

import com.spring1.quest.Quest;

/**
 * Created by mf57 on 04.04.2016.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
