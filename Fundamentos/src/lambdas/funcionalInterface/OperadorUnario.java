package lambdas.funcionalInterface;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> aoQuadrado = num -> num * num;

        int result1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
        System.out.println(result1);

        //compose executa ao contrário
        int result2 = maisDois.compose(vezesDois).compose(aoQuadrado).apply(2);
        System.out.println(result2);
    }
}
