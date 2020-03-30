package hu.flowacademy.appointmentmaker.config.exception;

public class ProvidedServiceNotFoundException extends NotFoundException {

    public ProvidedServiceNotFoundException(Long id) {
        super("provided service");
    }
}
