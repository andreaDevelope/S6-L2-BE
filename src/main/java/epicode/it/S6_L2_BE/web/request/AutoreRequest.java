package epicode.it.S6_L2_BE.web.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AutoreRequest {
    private String nome;

    private String cognome;

    private String email;

    private LocalDate dataDiNascita;
}
