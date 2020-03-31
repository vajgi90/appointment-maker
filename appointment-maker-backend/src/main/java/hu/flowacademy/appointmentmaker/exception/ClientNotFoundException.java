package hu.flowacademy.appointmentmaker.exception;

public class ClientNotFoundException extends NotFoundException {

    public ClientNotFoundException(Long id) {
        super("client");
    }
}
