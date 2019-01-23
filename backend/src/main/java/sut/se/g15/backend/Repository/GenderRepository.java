package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Gender;

@RepositoryRestResource
public
interface GenderRepository extends JpaRepository<Gender, Long> {
    Gender findBygender(String gender);
}
