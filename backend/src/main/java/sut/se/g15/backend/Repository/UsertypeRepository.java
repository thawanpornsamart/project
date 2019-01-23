package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Usertype;

@RepositoryRestResource
public interface UsertypeRepository extends JpaRepository<Usertype, Long> {
    Usertype findBytype(String type);
}
