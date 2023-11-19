package Conteudo;

public class Curso extends Conteudo {

    private String cargaHoraria;
    public double calcularXP() {
        return XP_PADRAO + 40d;
    }
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + "]";
    }
    
    
}