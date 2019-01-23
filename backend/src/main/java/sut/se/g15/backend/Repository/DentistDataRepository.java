package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.DentistData;

@RepositoryRestResource
public interface DentistDataRepository extends JpaRepository<DentistData, Long> {
    DentistData findByfirstname(String firstname);
}
