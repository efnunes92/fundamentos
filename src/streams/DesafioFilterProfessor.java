package streams;

import lambdas.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilterProfessor {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Geladeira", 2089.90, 0.30, 0.0);
        Produtos p2 = new Produtos("Mini geladeira portátil", 359.90, 0.12, 0.0);
        Produtos p3 = new Produtos("Smart TV LED 50", 2099.00,0.42,0.0);
        Produtos p4 = new Produtos("Smartpgone A30s", 1379.00, 0.18,0.0);
        Produtos p5 = new Produtos("Aspirador Robô", 510.84, 0.35,0.0);

        List<Produtos> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produtos> desconto = p -> p.desconto >= 0.30;
        Predicate<Produtos> frete = f -> f.valorFrete() == 0.0;
        Function<Produtos, String> saida = s -> s.nome + " tem o valor de " + s.preco + " e frete grátis...";

        produtos.stream()
                .filter(desconto)
                .filter(frete)
                .map(saida)
                .forEach(System.out::println);
    }
}
