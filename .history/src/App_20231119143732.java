import java.time.LocalDate;

import Conteudo.Curso;
import Conteudo.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java basico");
        curso1.setDescricao("Curso de java basico");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("Aprendendo POO com Java");
        mentoria1.setDescricao("explicito no titulo");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1.getTitulo());
        System.out.println(mentoria1);
    }
      
      
}
