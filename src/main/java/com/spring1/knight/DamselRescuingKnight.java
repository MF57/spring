package com.spring1.knight;

import com.spring1.quest.RescueDamselQuest;

/**
 * Created by mf57 on 04.04.2016.
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
