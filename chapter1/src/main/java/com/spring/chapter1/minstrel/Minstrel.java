package com.spring.chapter1.minstrel;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

/**
 * Created by mf57 on 05.04.2016.
 */

/*
 These annotations enables aop in this class, however using knights.xml configuration, which also defines this
 aspect solely in xml. So, after launching app with knights.xml conf there will be 2 Minstrel aspects. Currently
 I don't know how to enable it from java configuration only or if it even is possible. So with xml conf minstrel will
 sing 2 times but with java config 0 times.
 */
@Aspect
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }


    //Idk if it is the right way (but works) - there should be probably @Pointcut somewhere as in xml conf
    @Before("execution(* *.embarkOnQuest(..))")
    public void singBeforeQuest() {
        stream.println("The knight is going on a quest");
    }

    @After("execution(* *.embarkOnQuest(..))")
    public void singAfterQuest() {
        stream.println("The knight has successfully completed the quest");
    }
}
