package Conteudo;

public  abstract class Conteudo {

    private String titulo;
    private String descricao;
    
    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXP();
}
