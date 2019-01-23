package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Queue;

@RepositoryRestResource
public interface QueueRepository extends JpaRepository<Queue, Long> {
    Queue findByqueueNumber(String queueNumber);
}
