import java.time.LocalDate;

import Bootcamp.Bootcamp;
import Conteudo.Curso;
import Conteudo.Mentoria;
import Dev.Dev;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java basico");
        curso1.setDescricao("Curso de java basico");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Java intermediario");
        curso2.setDescricao("Curso de java intermediario");
        curso2.setCargaHoraria(16);

        mentoria1.setTitulo("Aprendendo POO com Java");
        mentoria1.setDescricao("explicito no titulo");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Boorcamp JAVA develooper");
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println(devMaria.getConteudosInscritos());
        
        System.out.println(devMaria);

    }
      
      
}
