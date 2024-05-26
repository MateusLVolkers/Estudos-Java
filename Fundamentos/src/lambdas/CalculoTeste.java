package lambdas;

public class CalculoTeste {

    public static void main(String[] args) {
        Calculo mult = new Multiplicar();
        Calculo sum = new Somar();

        System.out.println(mult.executar(1.2, 2.3));
        System.out.println(sum.executar(2,3));
    }
}
