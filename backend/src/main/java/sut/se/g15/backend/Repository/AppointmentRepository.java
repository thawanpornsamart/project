package sut.se.g15.backend.Repository;

import sut.se.g15.backend.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;

@RepositoryRestResource
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment findBydate(Date date);
}
