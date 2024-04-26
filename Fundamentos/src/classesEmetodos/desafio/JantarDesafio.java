package classesEmetodos.desafio;

public class JantarDesafio {

    public static void main(String[] args) {
        ComidaDesafio comida = new ComidaDesafio("Arroz", 0.5);
        PessoaDesafio pessoaDesafio = new PessoaDesafio("Mateus", 110.0);

        pessoaDesafio.antesDoJantar();
        pessoaDesafio.comer(comida);
        pessoaDesafio.depoisDoJantar();
    }
}
