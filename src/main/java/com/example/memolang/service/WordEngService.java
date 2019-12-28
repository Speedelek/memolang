package com.example.memolang.service;

import com.example.memolang.entities.WordEngEntity;
import com.example.memolang.repository.WordEngRepository;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWords;
import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.english_words.EnglishWordsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class WordEngService {

    @Autowired
    private WordEngRepository wordEngRepository;

    @Autowired
    EnglishWordsManager englishWordsManager;

    public void setWordEngRepository(WordEngRepository wordEngRepository){this.wordEngRepository = wordEngRepository;}

    public List<WordEngEntity> getEnglishWords(){return wordEngRepository.findAll();}

    public List<EnglishWords> getAllEnglishWords(){
        return englishWordsManager.stream().collect(Collectors.toList());
    }


    public List<WordEngEntity> getTenRandomWord() {
        Random rand = new Random();
        Integer randomId;
        ArrayList<WordEngEntity> list = new ArrayList<WordEngEntity>();
        for(int i = 0; i <= 10; i++){
            randomId = rand.nextInt(3582);
            list.add((WordEngEntity) wordEngRepository.findRandomRow(randomId));
        }
        return list;
    }


}
