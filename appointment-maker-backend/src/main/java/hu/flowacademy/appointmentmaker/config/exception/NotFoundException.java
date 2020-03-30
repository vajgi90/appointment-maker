package hu.flowacademy.appointmentmaker.config.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("missing." + message);
    }
}
