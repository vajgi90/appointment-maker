package hu.flowacademy.appointmentmaker.exception;

public class CompanyNotFoundException extends NotFoundException {

    public CompanyNotFoundException(Long id) {
        super("Company id: " + id + "is not found.");
    }
}
