package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {
        Consumer<String> imprimir = System.out::print;
        List<String> marcas = Arrays.asList("Volks   ", "GM   ", "Honda   ", "Fiat   ");

        //marcas.stream().map(marca -> marca.toUpperCase()).forEach(imprimir);

        UnaryOperator<String> maiuscula = String::toUpperCase;
        UnaryOperator<String> primLetra = letras -> letras.charAt(0) + "  ";
        marcas.stream()
                .map(maiuscula)
                .map(primLetra)
                .forEach(imprimir);
    }
}
