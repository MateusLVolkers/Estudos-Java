package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> imprimir = System.out::print;

        Stream<String> langs = Stream.of("Java   ", "JS   ", "Kotlin   ", "NodeJS   ");
        langs.forEach(imprimir);

        System.out.println("\n");
        String[] maisLangs = {"Go   ", "React   ", "FORTRAN   ", "C   "};
        Stream.of(maisLangs).forEach(imprimir);
        System.out.println("\n");
        Arrays.stream(maisLangs).forEach(imprimir);
        System.out.println("\n");
        Arrays.stream(maisLangs, 1,3).forEach(imprimir);

        System.out.println("\n");

        List<String> outrasLangs = Arrays.asList("PHP   ", "C#   ", "Python   ");
        outrasLangs.parallelStream().forEach(imprimir);



    }
}
