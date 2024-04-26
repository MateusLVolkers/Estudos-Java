package classesEmetodos.desafio;

public class PessoaDesafio {

    String nome;
    double peso;
    double aumentoDePeso;

    public void setAumentoDePeso(double aumentoDePeso) {
        this.aumentoDePeso = aumentoDePeso;
    }


    PessoaDesafio(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(ComidaDesafio comida) {
        System.out.printf("Comendo %s\n", comida.nome);
        peso += comida.peso;
        aumentoDePeso = comida.peso;
    }

    void antesDoJantar() {
        System.out.printf("A pessoa %s tinha %.2f Kg antes do jantar\n", nome, peso);
    }

    void depoisDoJantar() {
        System.out.printf("A pessoa %s tem %.2f Kg depois do jantar, uma diferença de %.2f Kg\n", nome, peso, aumentoDePeso);
    }

}
