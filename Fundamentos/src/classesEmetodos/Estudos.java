package classesEmetodos;

public class Estudos {

    static final double PI = 3.14;
    int id;
    String nome;

    Estudos(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    void imprimirObj() {
        System.out.printf("%d, %s\n", id, nome);
    }

}
