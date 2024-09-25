import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       Curso cursoJava = new Curso();
       cursoJava.setTitulo("Curso Java");
       cursoJava.setDescricao("Descrição curso Java");
       cursoJava.setCargaHoraria(8);

       Curso cursoJS = new Curso();
       cursoJS.setTitulo("Curso JavaScript");
       cursoJS.setDescricao("Descrição curso JavaScript");
       cursoJS.setCargaHoraria(4);

       Mentoria mentoriaJava = new Mentoria();
       mentoriaJava.setTitulo("Mentoria Java");
       mentoriaJava.setDescricao("Descrição mentoria Java");
       mentoriaJava.setData(LocalDate.now());

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(cursoJava);
       bootcamp.getConteudos().add(cursoJS);
       bootcamp.getConteudos().add(mentoriaJava);

       Dev devJoao = new Dev();
       devJoao.setNome("João");
       devJoao.inscreverBootcamp(bootcamp);
       devJoao.progredir();
       devJoao.progredir();
       System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
       System.out.println("XP Total João: " + devJoao.calcularTotalXp());

       Dev devMaria = new Dev();
       devMaria.setNome("Maria");
       devMaria.inscreverBootcamp(bootcamp);
       devMaria.progredir();
       System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
       System.out.println("XP Total Maria: " + devMaria.calcularTotalXp());
    }
}
