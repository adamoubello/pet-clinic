package com.adamoubello.petclinic.repositories;

import com.adamoubello.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;


public interface VisitRepository extends CrudRepository<Visit, Long> {
}
