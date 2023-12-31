package Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
   
    private LocalDate data;

    public double calcularXP() {
        return XP_PADRAO + 30d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    


    
}
