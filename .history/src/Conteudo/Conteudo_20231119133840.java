package Conteudo;

public  abstract class Conteudo {

    private String titulo;
    private String descricao;
    private String cargaHoraria;
    
    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXP(double xp);
}
