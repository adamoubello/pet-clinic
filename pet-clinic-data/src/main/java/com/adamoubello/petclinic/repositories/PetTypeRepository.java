package com.adamoubello.petclinic.repositories;

import com.adamoubello.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
