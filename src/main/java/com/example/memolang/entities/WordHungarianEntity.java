package com.example.memolang.entities;

import javax.persistence.*;

@Entity
@Table(name = "hungarian_words")
public class WordHungarianEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "hungarian_word_id")
        Integer hungarianWordId;

    @Column(name = "hungarian_word")
        String HungarianWord;

        public WordHungarianEntity(Integer hungarianWordId, String hungarianWord) {
            this.hungarianWordId = hungarianWordId;
            HungarianWord = hungarianWord;
        }

        public WordHungarianEntity(){

        }

        public Integer getHungarianWordId() {
            return hungarianWordId;
        }

        public void setHungarianWordId(Integer hungarianWordId) {
            this.hungarianWordId = hungarianWordId;
        }

        public String getHungarianWord() {
            return HungarianWord;
        }

        public void setHungarianWord(String hungarianWord) {
            HungarianWord = hungarianWord;
        }

}
