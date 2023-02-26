import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java 8+");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Introdução JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição");
        bootcampJava.addConteudo(curso1);
        bootcampJava.addConteudo(curso2);
        bootcampJava.addConteudo(mentoria);

        Dev devEdson = new Dev();
        devEdson.setNome("Edson");
        devEdson.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
        devEdson.progredir();
        devEdson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edson:" + devEdson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Edson:" + devEdson.getConteudosConcluidos());
        System.out.println("XP:" + devEdson.calcularTotalXp());

        System.out.println("-------");

        Dev devMinoru = new Dev();
        devMinoru.setNome("c");
        devMinoru.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Minoru:" + devMinoru.getConteudosInscritos());
        devMinoru.progredir();
        devMinoru.progredir();
        devMinoru.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Minoru:" + devMinoru.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Minoru:" + devMinoru.getConteudosConcluidos());
        System.out.println("XP:" + devMinoru.calcularTotalXp());


    }
}
