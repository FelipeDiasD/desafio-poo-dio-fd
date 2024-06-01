import br.com.dio.felipe.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java Basico","Curso de Java Basico", 2);

        Curso curso2 = new Curso("POO", "Curso de POO", 5);

        Mentoria mentoria = new Mentoria(
                "Carreira em Java",
                "Mentoria de carreira como especialista em Java",
                LocalDate.now()
        );

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer"
        );
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Dev dev1 = new Dev("Jorge");
        dev1.inscreveBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev1.getConteudosConcluidos());

        System.out.println("==================================");

        Dev dev2 = new Dev("Mauro");
        dev2.inscreveBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev2.getConteudosConcluidos());
    }
}