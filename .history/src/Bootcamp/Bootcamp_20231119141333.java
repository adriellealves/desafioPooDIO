package Bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private  Set<Conteudo> conteudos = new LinkedHashSet<>();

}
