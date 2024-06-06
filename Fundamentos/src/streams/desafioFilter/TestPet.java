package streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestPet {

    public static void main(String[] args) {

        Pet Mandy = new Pet("Mandy", "Cachorro", true);
        Pet Jheny = new Pet("Jheny", "Cachorro", true);
        Pet Pedro = new Pet("Pedro", "Cachorro", true);
        Pet Maicon = new Pet("Maicon", "Gato", false);
        Pet Branquinha = new Pet("Branquinha", "Cachorro", true);
        Pet Gato = new Pet("Gato", "Gato", true);

        List<Pet> pets = Arrays.asList(Mandy, Jheny, Pedro, Maicon, Branquinha, Gato);

        Predicate<Pet> verificaCachorro = pet -> Objects.equals(pet.especie, "Cachorro");
        Predicate<Pet> verificaComportamento = pet -> pet.comportamento == true;
        Function<Pet, String> bomGaroto = pet -> "Bom menino(a) " + pet.nome + "!!";

        pets.stream()
                .filter(verificaCachorro)
                .filter(verificaComportamento)
                .map(bomGaroto)
                .forEach(System.out::println);



    }
}
