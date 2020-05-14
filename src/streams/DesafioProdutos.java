package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioProdutos {
    public static void main(String[] args) {

        Produto p1 = new Produto("Smartphone", 849.99);
        Produto p2 = new Produto("Smart TV Led 50", 2099.00);
        Produto p3 = new Produto("Notebook", 4099.99);
        Produto p4 = new Produto("Fritadeira", 299.99);
        Produto p5 = new Produto("Oximetro de dedo", 141.39);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> desconto = p -> p.valorDesconto() >= 0.3;
        Predicate<Produto> freteGratis = f -> f.valorFrete() == 0.0;

        Function<Produto, String> mensagemFinal =
                m -> "O produto " + m.nome + " está com " + m.desconto + "% de desconto e frete grátis.";

        produtos.stream()
                .filter(desconto)
                .filter(freteGratis)
                .map(mensagemFinal)
                .forEach(System.out::println);
    }
}
