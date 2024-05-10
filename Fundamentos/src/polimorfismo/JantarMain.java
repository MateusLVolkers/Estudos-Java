package polimorfismo;

public class JantarMain {

    public static void main(String[] args) {
        Arroz arroz = new Arroz("arroz", 0.2);
        Feijao feijao = new Feijao("feijao", 0.15);
        Pessoa pessoa = new Pessoa("João", 99.5);

        System.out.println(arroz.peso);
        System.out.println(feijao.peso);
        System.out.println(pessoa.getPeso());
        System.out.println(pessoa.getNome());

        pessoa.comer(arroz);
        pessoa.comer(feijao);

        System.out.println(pessoa);


    }
}
