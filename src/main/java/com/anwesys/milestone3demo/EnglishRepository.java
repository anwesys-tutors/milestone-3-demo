package com.anwesys.milestone3demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;

@RepositoryRestResource(collectionResourceRel = "englishDictionary", path = "en")
public interface EnglishRepository extends CrudRepository<English, Serializable> {
}
