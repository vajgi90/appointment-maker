package hu.flowacademy.appointmentmaker.exception;

public class AppointmentNotFoundException extends NotFoundException {

    public AppointmentNotFoundException(Long id) {
        super("Appointment id: " + id + " is not found.");
    }
}
