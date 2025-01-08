package epicode.it.S6_L2_BE.db.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class AutorePost {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String cognome;

    private String email;

    private LocalDate dataDiNascita;


}
