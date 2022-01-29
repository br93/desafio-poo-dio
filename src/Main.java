import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descricao de mentoria");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("new1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos DEV 1" + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos DEV 1" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos DEV 1" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("--------------");

        Dev dev2 = new Dev();
        dev2.setNome("new2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos DEV 2" + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos DEV 2" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos DEV 2" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
