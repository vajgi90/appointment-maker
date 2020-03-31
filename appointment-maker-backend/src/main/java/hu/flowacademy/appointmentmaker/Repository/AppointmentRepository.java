package hu.flowacademy.appointmentmaker.Repository;

import hu.flowacademy.appointmentmaker.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
