package sut.se.g15.backend.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import sut.se.g15.backend.Entity.Payment;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
