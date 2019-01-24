package sut.se.g15.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.se.g15.backend.Entity.DentistData;

@RepositoryRestResource
public interface DentistDataRepository extends JpaRepository<DentistData, Long> {
    DentistData findByfirstname(String firstname);

    @Query("SELECT t FROM DentistData t WHERE t.firstname=:fName and t.lastname=:lName")
    DentistData finnByfullName(@Param("fName")String FName, @Param("lName")String LName);
}
