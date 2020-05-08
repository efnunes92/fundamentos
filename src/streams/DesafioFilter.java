package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Livro l1 = new Livro("A Garota do Lago", 4.69, 14.90, 296);
        Livro l2 = new Livro("Manual de Persuasão do FBI", 5.0, 39.90, 256);
        Livro l3 = new Livro("O Homem De Giz", 4.59, 49.90, 272);
        Livro l4 = new Livro("A Garota No Gelo", 4.93, 30.53, 336);
        Livro l5 = new Livro("Bem Atrás De Você", 4.5, 44.90, 352);
        Livro l6 = new Livro("Em Águas Sombrias", 4.56, 49.90, 364);
        Livro l7 = new Livro("Detector de Mentiras", 0.0, 30.50, 280);
        Livro l8 = new Livro("Poder e Manipulação", 5.0, 27.90, 176);
        Livro l9 = new Livro("O Conto da Aia", 4.76, 31.15, 368);
        Livro l10 = new Livro("Mindhunter", 4.83, 49.90, 384);

        List<Livro> livros = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);

        Predicate<Livro> notas = l -> l.nota >= 4.0;
        Predicate<Livro> preco = l -> l.preco <= 40.0;
        Function<Livro, String> saida = l -> "O livro " + l.nome + " está dentro dos filtros pesquisados.";

        livros.stream()
                .filter(notas)
                .filter(preco)
                .map(saida)
                .forEach(System.out::println);

    }
}
