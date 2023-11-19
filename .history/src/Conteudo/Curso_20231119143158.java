package Conteudo;

public class Curso extends Conteudo {

    private double cargaHoraria;

    
    public double calcularXP() {
        return XP_PADRAO + 40d;
    }


    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + "]";
    }


   
    
}
