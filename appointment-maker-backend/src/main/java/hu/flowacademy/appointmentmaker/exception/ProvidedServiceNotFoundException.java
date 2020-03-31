package hu.flowacademy.appointmentmaker.exception;

public class ProvidedServiceNotFoundException extends NotFoundException {

    public ProvidedServiceNotFoundException(Long id) {
        super("provided service");
    }
}
