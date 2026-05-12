import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle("Curso Java");
        curso1.setDescription("Descricao curso Java");
        curso1.setWorkLoad(8);

        Curso curso2 = new Curso();
        curso2.setTitle("Curso TypeScript");
        curso2.setDescription("Descricao curso TypeScript");
        curso2.setWorkLoad(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitle("Mentoria de Java");
        mentoria.setDescription("Mentoria de Java");
        mentoria.setDate(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitle("Mentoria de TypeScript");
        mentoria2.setDescription("Mentoria de TypeScript");
        mentoria2.setDate(LocalDate.now());
        System.out.println(" ");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Conteudo Bootcamp Java");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(mentoria);
        System.out.println(" ");

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.registerBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Camila ->"+ devCamila.getRegisteredContents());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos de Camila ->"+ devCamila.getRegisteredContents());
        System.out.println("Conteudos concluidos de Camila ->"+ devCamila.getCompletedContents());
        System.out.println("XP: " + devCamila.calculateTotalXp());
        System.out.println("---");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.registerBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Joao ->"+ devJoao.getRegisteredContents());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos de Joao -> "+ devJoao.getRegisteredContents());
        System.out.println("Conteudos concluidos de Joao -> "+ devJoao.getCompletedContents());
        System.out.println("XP: " + devJoao.calculateTotalXp());
        System.out.println("---");
    }
}
