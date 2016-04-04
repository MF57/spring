package com.spring1.quest;

import java.io.PrintStream;

/**
 * Created by mf57 on 04.04.2016.
 */
public class SlayingDragonQuest implements Quest {
    private PrintStream stream;

    public SlayingDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Slaying Dragon!");
    }
}
