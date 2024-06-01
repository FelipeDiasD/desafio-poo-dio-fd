import br.com.dio.felipe.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Basico");
        curso1.setDescricao("Curso de Java Basico");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO");
        curso2.setDescricao("Curso de POO");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira em Java");
        mentoria.setDescricao("Mentoria de carreira como especialista em Java");
        mentoria.setData(LocalDate.now());




        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Dev dev1 = new Dev();
        dev1.setNome("Jorge");
        dev1.inscreveBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev1.getConteudosConcluidos());

        System.out.println("==================================");

        Dev dev2 = new Dev();
        dev2.setNome("Mauro");
        dev2.inscreveBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + dev2.getConteudosConcluidos());
    }
}