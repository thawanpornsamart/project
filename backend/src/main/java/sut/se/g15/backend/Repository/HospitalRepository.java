package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Hospital;

@RepositoryRestResource
public
interface HospitalRepository extends JpaRepository<Hospital, Long> {
    Hospital findByhospital(String hospital);
}

