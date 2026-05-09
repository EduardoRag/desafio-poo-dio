import br.com.dio.desafio.dominio.Curso;


public class Main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle("Curso Java");
        curso1.setDescription("Descricao curso Java");
        curso1.setWorkLoad(6);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitle("Curso Java Script");
        curso2.setDescription("Descricao curso Js");
        curso2.setWorkLoad(6);
        System.out.println(curso2);
    }
}
