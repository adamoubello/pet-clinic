package com.adamoubello.petclinic.repositories;

import com.adamoubello.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
