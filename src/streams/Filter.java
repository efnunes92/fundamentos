package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);


        System.out.println("Função dentro do filter e map");
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabéns " + a.nome + " você foi aprovado")
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("Filter e map chamando funções externas");
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> parabens = a -> "Parabéns " + a.nome + " você foi aprovado";

        alunos.stream()
                .filter(aprovado)
                .map(parabens)
                .forEach(System.out::println);

    }
}
