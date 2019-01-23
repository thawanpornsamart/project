package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Type;

@RepositoryRestResource
public
interface TypeRepository extends JpaRepository<Type, Long> {
    Type findBynameType(String nameType);
}

