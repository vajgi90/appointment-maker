package hu.flowacademy.appointmentmaker.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Transient
    @JsonIgnore
    private String password;

    @Column
    private Integer phoneNumber;

    @Column(unique = true, length = 100)
    private String email;

    @ManyToOne
    private Company company;
}
