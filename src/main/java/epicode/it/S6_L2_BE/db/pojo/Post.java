package epicode.it.S6_L2_BE.db.pojo;

import epicode.it.S6_L2_BE.enums.TipoPost;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private TipoPost categoria;

    private String titolo;

    private String contenuto;

    private double tempoLettura;


}
