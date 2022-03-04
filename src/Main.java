import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentodria de Java");
        mentoria.setCargaHoraria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #4");
        bootcamp.setDescricao("Desrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev desenvolvedor1, desenvolvedor2;

        desenvolvedor1 = new Dev();
        desenvolvedor1.setNome("Savio");
        desenvolvedor1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de "+desenvolvedor1.getNome()
                +" "+desenvolvedor1.getConteudosInscritos());
        desenvolvedor1.Progredir();
        desenvolvedor1.Progredir();
        System.out.println(" - ");
        System.out.println("Conteudos inscritos "+desenvolvedor1.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+desenvolvedor1.getConteudosComcluidos());
        System.out.println("XP: "+desenvolvedor1.calcularTotalXP());


        desenvolvedor2 = new Dev();
        desenvolvedor2.setNome("Katia");
        desenvolvedor2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+desenvolvedor2.getConteudosInscritos());

    }
}
