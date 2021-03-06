package hu.flowacademy.appointmentmaker.Controller;

import hu.flowacademy.appointmentmaker.Model.Company;
import hu.flowacademy.appointmentmaker.Service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompanyController {

    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        return new ResponseEntity<>(companyService.createCompany(company), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> findOne(@PathVariable Long id) {
        return new ResponseEntity(companyService.findOneCompany(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany (@PathVariable Long id, @RequestBody Company company){
        return new ResponseEntity(companyService.updateCompanyDetails(id, company), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable long id) {
        companyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}
