package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObj {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("João   ", "Kiko   ", "Beny   ");

        System.out.println("Usando forEach");
        for(String nome: aprovados){
            System.out.print(nome);
        }

        System.out.println("\n\nUsando Iterator");
        Iterator<String> iterador = aprovados.iterator();
        while (iterador.hasNext()){
            System.out.print(iterador.next());
        }

        System.out.println("\n\nUsando stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::print);


    }
}
