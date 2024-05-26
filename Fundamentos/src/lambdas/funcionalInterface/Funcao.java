package lambdas.funcionalInterface;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = num -> num % 2 == 0? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(25));

        Function<String, String> resultadoE = valor -> "O resultado é " + valor;
        String resultadoFinal = parOuImpar.andThen(resultadoE).apply(22);

        System.out.println(resultadoFinal);
    }
}
