package com.example.memolang.service;

import com.example.memolang.entities.WordEngEntity;
import com.example.memolang.repository.WordEngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class WordEngService {

    @Autowired
    private WordEngRepository wordEngRepository;

    public void setWordEngRepository(WordEngRepository wordEngRepository){this.wordEngRepository = wordEngRepository;}

    public List<WordEngEntity> getEnglishWords(){return wordEngRepository.findAll();}


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
