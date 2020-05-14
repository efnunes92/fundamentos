package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioLivraria {
    public static void main(String[] args) {

        Livros l1 = new Livros("Manual de Persuasão do FBI", 44.90, 256);
        Livros l2 = new Livros("A Garota do lago", 14.90, 296);
        Livros l3 = new Livros("O Homem de Giz", 39.87, 272);
        Livros l4 = new Livros("O Que Aconteceu Com Annie", 54.90, 288);
        Livros l5 = new Livros("Mulheres Que Correm Com Os Lobos", 69.90, 576);

        List<Livros> livro = Arrays.asList(l1, l2, l3, l4, l5);

        Predicate<Livros> preco = p -> p.preco <= 40.0;
        Predicate<Livros> paginas = p -> p.paginas < 350;
        Function<Livros, String> mensagemFinal =
                l -> "O livro " + l.nome + " tem " + l.paginas + " e seu preco é R$" + l.preco;

        livro.stream()
                .filter(preco)
                .filter(paginas)
                .map(mensagemFinal)
                .forEach(System.out::println);
    }
}
