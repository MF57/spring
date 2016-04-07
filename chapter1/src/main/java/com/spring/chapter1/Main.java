package com.spring.chapter1;

import com.spring.chapter1.config.KnightsConfig;
import com.spring.chapter1.knight.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mf57 on 04.04.2016.
 */
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("knights.xml");
        Knight knightFromXml = (Knight) xmlContext.getBean("knight");
        knightFromXml.embarkOnQuest();
        xmlContext.close();

        AnnotationConfigApplicationContext javaContext = new AnnotationConfigApplicationContext(KnightsConfig.class);
        Knight knightFromJavaConfig = (Knight) javaContext.getBean("knight");
        knightFromJavaConfig.embarkOnQuest();
        javaContext.close();
    }

}
