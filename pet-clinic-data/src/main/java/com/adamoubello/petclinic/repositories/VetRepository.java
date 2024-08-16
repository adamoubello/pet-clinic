package com.adamoubello.petclinic.repositories;

import com.adamoubello.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
