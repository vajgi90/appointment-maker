package hu.flowacademy.appointmentmaker.config.exception;

public class AppointmentNotFoundException extends NotFoundException {

    public AppointmentNotFoundException(Long id) {
        super("provided service");
    }
}
