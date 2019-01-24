package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByfirstname(String firstname);

    @Query("select t from Customer t where t.firstname =:fName and t.lastname = :lName")
    Customer findByFullName(@Param("fName")String FName, @Param("lName")String LName);
}
