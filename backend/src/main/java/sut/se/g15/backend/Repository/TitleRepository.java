package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Title;

@RepositoryRestResource
public
interface TitleRepository extends JpaRepository<Title, Long> {
    Title findByname(String name);
}

