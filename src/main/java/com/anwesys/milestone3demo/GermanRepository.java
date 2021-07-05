package com.anwesys.milestone3demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;

@RepositoryRestResource(collectionResourceRel = "germanDictionary", path = "dict")
public interface GermanRepository extends CrudRepository<German, Serializable> {

    German findGermanByEnglish(English word);

    German findByWord(String word);
}
