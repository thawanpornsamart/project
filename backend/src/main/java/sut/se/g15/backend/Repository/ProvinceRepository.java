package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Province;

@RepositoryRestResource
public
interface ProvinceRepository extends JpaRepository<Province, Long> {
    Province findByname(String name);
}

