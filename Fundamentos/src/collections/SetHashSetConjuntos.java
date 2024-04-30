package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHashSetConjuntos {
    public static void main(String[] args) {

        /* HashSet não obedece a ordem de inserção.
        */
        //Set<String> nomes = new HashSet<>();
        Set<String> nomes = new TreeSet<>();
        nomes.add("Mateus");
        nomes.add("José");
        nomes.add("Mandy");
        nomes.add("Pedro");

        Set<String> nomesComuns = new HashSet<>();
        nomesComuns.add("João");
        nomesComuns.add("José");

        System.out.println(nomes.contains("José"));
        System.out.println(nomes.remove("José"));
        System.out.println(nomes.size());

        //União de conjuntos
        nomes.addAll(nomesComuns);
        System.out.println(nomes.size());
        for(String nome: nomes) {
            System.out.println(nome);
        }

        //Interseção de conjuntos
        nomes.retainAll(nomesComuns);
        System.out.println(nomes);
    }
}
