package hu.flowacademy.appointmentmaker.config.exception;

public class CompanyNotFoundException extends NotFoundException {

    public CompanyNotFoundException(Long id) {
        super("company");
    }
}
