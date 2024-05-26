package lambdas.funcionalInterface;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Produto prodTeste = new Produto("Celular", 2000.00, 0.12);

        Predicate<Produto> isCaro = produto -> produto.preco >= 1500;
        System.out.println(isCaro.test(prodTeste));
    }
}
