package lambdas.funcionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Produto prodTeste1 = new Produto("Celular", 2000.00, 0.12);
        Produto prodTeste2 = new Produto("Notebook", 3000.00, 0.15);
        Produto prodTeste3 = new Produto("Caneta", 10.00, 0.05);
        Produto prodTeste4 = new Produto("Fone", 140.00, 0.0);
        List<Produto> carrinho = Arrays.asList(prodTeste1, prodTeste2, prodTeste3, prodTeste4);


        Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
        imprimir.accept(prodTeste1);

        carrinho.forEach(imprimir);
    }
}
