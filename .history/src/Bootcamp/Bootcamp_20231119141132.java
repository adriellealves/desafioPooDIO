package Bootcamp;

import java.time.LocalDate;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFinal = dataInicio.plusDays(45);
}
