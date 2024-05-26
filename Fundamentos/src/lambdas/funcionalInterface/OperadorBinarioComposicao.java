package lambdas.funcionalInterface;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBinarioComposicao {

    public static void main(String[] args) {
        Produto prodTeste = new Produto("Celular", 2800.00, 0.12);

        /*
        1.  Calcular o preço com desconto
            Calcular o imposto municipal. Acima de 2500 tem 8,5%, abaixo é isento
            Calcular frete. Acima 2650 é 100, abaixo é 50
            Arredondar para 2 casas decimais
            Formatar para exibir o R$:
         */

        Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 2650 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", preco));
        Function<Double, String> formatar = preco -> ("R$: " + preco).replace(".", ",");

        String precoFinal = precoComDesconto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(prodTeste);
        System.out.println("O preço final do produto " + prodTeste.nome + " é " + precoFinal);

    }

}
