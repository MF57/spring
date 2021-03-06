package com.spring.chapter1.config;

import com.spring.chapter1.knight.BraveKnight;
import com.spring.chapter1.knight.Knight;
import com.spring.chapter1.quest.Quest;
import com.spring.chapter1.quest.SlayingDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mf57 on 04.04.2016.
 */
@Configuration
public class KnightsConfig {

    @Bean
    public Quest quest() {
        return new SlayingDragonQuest(System.out);
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

}
