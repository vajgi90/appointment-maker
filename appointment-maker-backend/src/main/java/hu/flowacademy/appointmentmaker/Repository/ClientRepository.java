package hu.flowacademy.appointmentmaker.Repository;

import hu.flowacademy.appointmentmaker.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
