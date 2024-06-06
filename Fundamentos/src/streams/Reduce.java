package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> somaAcumulador = (ac, num) -> ac + num;

        int total = numeros.stream().reduce(somaAcumulador).get();
        System.out.println(total);

    }
}
