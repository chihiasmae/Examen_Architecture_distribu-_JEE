package org.sid.repositories;
import org.sid.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}


