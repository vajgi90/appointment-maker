package hu.flowacademy.appointmentmaker.Service;

import hu.flowacademy.appointmentmaker.Model.Company;
import hu.flowacademy.appointmentmaker.Repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@AllArgsConstructor
@Transactional
public class CompanyService {

    private CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }
    /*
    Change the fondOneCompany to this code when the individual exceptions are going to be done.

     public Optional<Company> fondOneCompany(Long id) {
        return Optional.of(companyRepository.findById(id))
                .orElseThrow(() -> new CompanyNotFoundException(id));
     }*/

    public Company findOneCompany(Long id) {
        return companyRepository.findById(id).get();
    }

    public Company updateCompanyDetails(Long id, Company company) {
        company.setId(id);
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
