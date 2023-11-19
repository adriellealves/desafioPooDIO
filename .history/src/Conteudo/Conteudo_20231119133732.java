package Conteudo;

public  abstract class Conteudo {

    private String titulo;
    private String descricao;
    private String cargaHoraria;
    
    protected static final double XP_PADRAO = 10d;

    public double calcularXP( double xp){
      return  XP_PADRAO + xp;
    }
}
