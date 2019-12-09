package com.example.memolang.repository;


import com.example.memolang.entities.WordEngEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordEngRepository extends CrudRepository<WordEngEntity, Long> {

    List<WordEngEntity> findAll();


    @Query(value = "select * from szakdogadb.english_words where english_word_id = :engWordId", nativeQuery = true)
    WordEngEntity findRandomRow(@Param("engWordId") Integer randomId);
}
