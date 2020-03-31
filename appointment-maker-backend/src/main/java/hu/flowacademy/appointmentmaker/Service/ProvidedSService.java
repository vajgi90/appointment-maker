package hu.flowacademy.appointmentmaker.Service;

import hu.flowacademy.appointmentmaker.Model.ProvidedService;
import hu.flowacademy.appointmentmaker.Repository.ProvidedServiceRepository;
import hu.flowacademy.appointmentmaker.exception.ProvidedServiceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@AllArgsConstructor
@Transactional
public class ProvidedSService {

    private ProvidedServiceRepository providedServiceRepository;

    public ProvidedService createService(ProvidedService providedService) {
        return providedServiceRepository.save(providedService);
    }

     public Optional<ProvidedService> findOneService(Long id) {
        return Optional.of(providedServiceRepository.findById(id))
                .orElseThrow(() -> new ProvidedServiceNotFoundException(id));
     }

    public ProvidedService updateServiceDetails(Long id, ProvidedService providedService) {
        providedService.setId(id);
        return providedServiceRepository.save(providedService);
    }

    public void deleteService(Long id) {
        providedServiceRepository.deleteById(id);
    }
}
