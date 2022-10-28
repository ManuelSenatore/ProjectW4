package manuelsenatore.ProjectW4.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;

    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    List<Prenotazione> prenotazioni;


}
