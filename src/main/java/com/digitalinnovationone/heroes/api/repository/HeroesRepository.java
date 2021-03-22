package com.digitalinnovationone.heroes.api.repository;

import com.digitalinnovationone.heroes.api.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
