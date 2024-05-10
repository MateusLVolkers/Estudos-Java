package polimorfismo;

import java.text.DecimalFormat;

public class Pessoa {

    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        System.out.println("Comendo " + comida.getNome());
        this.peso += comida.getPeso();
    }

    @Override
    public String toString() {
        return "Me chamo " + getNome() + "e estou com " + getPeso() + " após esta refeição";
    }
}
