package hu.flowacademy.appointmentmaker.Service;

import hu.flowacademy.appointmentmaker.Model.Company;
import hu.flowacademy.appointmentmaker.Repository.CompanyRepository;
import hu.flowacademy.appointmentmaker.config.exception.CompanyNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@AllArgsConstructor
@Transactional
public class CompanyService {

    private CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

     public Optional<Company> fondOneCompany(Long id) {
        return Optional.of(companyRepository.findById(id))
                .orElseThrow(() -> new CompanyNotFoundException(id));
     }

    public Company updateCompanyDetails(Long id, Company company) {
        company.setId(id);
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
