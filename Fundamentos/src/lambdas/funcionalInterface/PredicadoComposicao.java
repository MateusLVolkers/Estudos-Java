package lambdas.funcionalInterface;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num%2 ==0;
        Predicate<Integer> tresDigitos = num -> num >= 100 && num < 1000;
        System.out.println(isPar.and(tresDigitos).test(123));
        System.out.println(isPar.or(tresDigitos).test(22));
    }
}
