package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Reserve;

@RepositoryRestResource
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    //Reserve findByreserveConfirm(boolean reserveConfirm);
}
