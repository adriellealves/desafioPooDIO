import Conteudo.Curso;
import Conteudo.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo('Java basico');
        curso1.setDescricao("Curso de java basico");
        curso1.setCargaHoraria(8);
    }
}
