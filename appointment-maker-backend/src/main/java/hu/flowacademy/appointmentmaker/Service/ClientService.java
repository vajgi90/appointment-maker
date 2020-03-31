package hu.flowacademy.appointmentmaker.Service;

import hu.flowacademy.appointmentmaker.Model.Client;
import hu.flowacademy.appointmentmaker.Repository.ClientRepository;
import hu.flowacademy.appointmentmaker.exception.ClientNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@AllArgsConstructor
@Transactional
public class ClientService {

    private ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Optional<Client> findOneClient(Long id) {
        return Optional.of(clientRepository.findById(id))
                .orElseThrow(() -> new ClientNotFoundException(id));
    }

    public Client updateClientDetails(Long id, Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }


}
