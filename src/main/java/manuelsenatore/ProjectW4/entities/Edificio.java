package manuelsenatore.ProjectW4.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private Citta citta;

    @OneToMany(mappedBy = "edificio")
    @ToString.Exclude
    @JsonIgnore        // ignora completamente la proprietà
    List<Postazione> postazioni;


}
