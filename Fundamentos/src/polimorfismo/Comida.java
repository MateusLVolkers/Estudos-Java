package polimorfismo;

public class Comida {

    String nome;
    double peso;
    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
}
