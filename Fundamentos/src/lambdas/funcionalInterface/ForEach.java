package lambdas.funcionalInterface;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana  ", "João  ", "Kiko  ", "Ale  ");

        System.out.println("Forma tradicional:");
        for (String nome: aprovados) {
            System.out.print(nome);
        }

        System.out.println("\n\nLambda 01");
        aprovados.forEach(nome -> System.out.print(nome));

        System.out.println("\n\nLambda 02");
        aprovados.forEach(nome -> imprimirPadrao(nome));

        System.out.println("\n\nMethod reference");
        aprovados.forEach(System.out::print);

        System.out.println("\n\n Method reference 02");
        aprovados.forEach(ForEach::imprimirPadrao);
    }

    static void imprimirPadrao(String nome) {
        System.out.print("_Meu nome é " + nome);
    }
}
