package com.example.memolang.config;

import com.example.memolang.szakdogadb.SzakdogadbApplication;
import com.example.memolang.szakdogadb.SzakdogadbApplicationBuilder;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWordsManager;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.hungarian_words.HungarianWordsManager;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd.UAsd;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.u_asd.UAsdManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpeedmentConfig {

    @Bean
    SzakdogadbApplication getApplication(){
        return new SzakdogadbApplicationBuilder()
                .withUsername("root")
                .withPassword("")
                .build();
    }

    @Bean
    EnglishWordsManager getEnglishWords(SzakdogadbApplication app){
        return app.getOrThrow(EnglishWordsManager.class);
    }

    @Bean
    HungarianWordsManager getHungarianWordsManager(SzakdogadbApplication app) {return app.getOrThrow(HungarianWordsManager.class);}

    @Bean
    UAsdManager getUAsdManager(SzakdogadbApplication app){return app.getOrThrow(UAsdManager.class);}

}
