package hu.flowacademy.appointmentmaker.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appointments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long startingTime;

    @Column
    private Long endingTime;

    @ManyToMany
    private List<ProvidedService> providedServices;

    @ManyToMany
    private List<Client> clients;

}
