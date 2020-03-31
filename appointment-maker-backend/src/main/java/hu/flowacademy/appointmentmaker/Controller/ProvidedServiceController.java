package hu.flowacademy.appointmentmaker.Controller;

import hu.flowacademy.appointmentmaker.Model.Company;
import hu.flowacademy.appointmentmaker.Model.ProvidedService;
import hu.flowacademy.appointmentmaker.Service.CompanyService;
import hu.flowacademy.appointmentmaker.Service.ProvidedSService;
import javafx.concurrent.Service;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
@AllArgsConstructor
public class ProvidedServiceController {

    private ProvidedSService providedSService;

    @PostMapping
    public ResponseEntity<ProvidedService> createService(@RequestBody ProvidedService providedService) {
        return new ResponseEntity<>(providedSService.createService(providedService), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProvidedService> findOne(@PathVariable Long id) {
        return providedSService.findOneService(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProvidedService> updateService (@PathVariable Long id, @RequestBody ProvidedService providedService){
        providedSService.updateServiceDetails(id,providedService);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable long id) {
        providedSService.deleteService(id);
        return ResponseEntity.noContent().build();
    }
}
