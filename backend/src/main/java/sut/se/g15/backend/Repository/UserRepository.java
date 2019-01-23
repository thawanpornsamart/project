package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
        User findByfirstname(String firstname);
        User findByemail(String email);
        User findByType(String type);
        User findBypassword(String password);
}
