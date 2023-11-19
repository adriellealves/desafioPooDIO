package Conteudo;

public class Curso extends Conteudo {

    private double cargaHoraria;

    
    public double calcularXP() {
        return XP_PADRAO + 40d;
    }


    public double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }



}
