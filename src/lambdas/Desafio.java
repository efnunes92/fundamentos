package lambdas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Double, Double> precoReal =
                produto -> p.preco * (1 - p.desconto);

        Function<Double, Double> impostoMunicipal =
                imposto -> imposto >= 2500 ? imposto * (1 + 0.085) : imposto;

        Function<Double, Double> calcFrete =
                frete -> frete >= 3000 ?
                        Double.valueOf(new DecimalFormat("#0.#", new DecimalFormatSymbols(new Locale("en", "US"))).format(frete) + 100) :
                        Double.valueOf(new DecimalFormat("#0.#", new DecimalFormatSymbols(new Locale("en", "US"))).format(frete) + 50) ;

        double valorFinal = precoReal
                .andThen(impostoMunicipal)
                .andThen(calcFrete)
                .apply(p.preco);

        System.out.printf("R$%.2f",valorFinal);

    }
}
