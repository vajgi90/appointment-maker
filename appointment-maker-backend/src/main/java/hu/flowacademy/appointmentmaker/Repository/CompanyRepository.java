package hu.flowacademy.appointmentmaker.Repository;

import hu.flowacademy.appointmentmaker.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findFirstByEmail(String email);
}
