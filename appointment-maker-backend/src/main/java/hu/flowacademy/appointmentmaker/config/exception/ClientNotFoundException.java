package hu.flowacademy.appointmentmaker.config.exception;

public class ClientNotFoundException extends NotFoundException {

    public ClientNotFoundException(Long id) {
        super("client");
    }
}
