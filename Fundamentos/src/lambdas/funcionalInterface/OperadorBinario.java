package lambdas.funcionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (a, b) -> (a + b) / 2;
        System.out.println(media.apply(2.0,3.2));

        BiFunction<Double, Double, String > result = (n1, n2) ->
                (n1 + n2) / 2 >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(result.apply(7.1, 5.5));

    }
}
