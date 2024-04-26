package classesEmetodos;

public class EstudosTeste {

    public static void main(String[] args) {

        EstudosTeste t = new EstudosTeste();
        t.teste();
        System.out.println(Estudos.PI);

        Estudos estudos = new Estudos(0, "Mateus");
        estudos.imprimirObj();


    }

    public void teste() {
        System.out.println("testando");
    }

}
