package com.anwesys.milestone3demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.*;
import java.io.Serializable;

@RepositoryRestResource(collectionResourceRel = "spanishDictionary", path = "esp")
public interface SpanishRepository extends CrudRepository<Spanish, Serializable> {
}
