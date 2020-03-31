package hu.flowacademy.appointmentmaker.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private Integer phoneNumber ;

    @Column
    private String representative;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<ProvidedService> providedServices;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private List<Client> clients;

}
