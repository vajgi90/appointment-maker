package hu.flowacademy.appointmentmaker.Controller;

import hu.flowacademy.appointmentmaker.Model.Client;
import hu.flowacademy.appointmentmaker.Service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
@AllArgsConstructor
public class ClientController {


    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> createCompany(@RequestBody Client company) {
        return new ResponseEntity<>(clientService.createClient(company), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findOne(@PathVariable Long id) {
        return clientService.findOneClient(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateCompany (@PathVariable Long id, @RequestBody Client company){
        clientService.updateClientDetails(id, company);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable long id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}
