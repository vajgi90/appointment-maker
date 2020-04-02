package hu.flowacademy.appointmentmaker.Repository;

import hu.flowacademy.appointmentmaker.Model.ProvidedService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvidedServiceRepository extends JpaRepository<ProvidedService, Long> {
}
