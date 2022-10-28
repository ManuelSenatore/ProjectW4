package manuelsenatore.ProjectW4.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int maxSize;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

}
