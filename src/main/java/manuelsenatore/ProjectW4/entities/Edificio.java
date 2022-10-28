package manuelsenatore.ProjectW4.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "edifici")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;

    @ManyToOne
    @JoinColumn(name = "citta_id")
    private Citta citta;

    @OneToMany(mappedBy = "edificio")
    @ToString.Exclude
    List<Postazione> postazioni;


}
