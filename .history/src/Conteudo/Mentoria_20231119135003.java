package Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXP() {
        return XP_PADRAO + 30d;
    }

    
}
