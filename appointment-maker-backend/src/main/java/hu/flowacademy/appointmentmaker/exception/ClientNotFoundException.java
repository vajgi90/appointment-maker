package hu.flowacademy.appointmentmaker.exception;

public class ClientNotFoundException extends NotFoundException {

    public ClientNotFoundException(Long id) {
        super("Client id:" + id + " is not found.");
    }
}
