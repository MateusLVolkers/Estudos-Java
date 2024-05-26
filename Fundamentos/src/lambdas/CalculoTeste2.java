package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {
        Calculo sum = ((a, b) -> {
           return a + b;
        });
        Calculo mult = (a, b) -> a * b;

        System.out.println(mult.executar(1.5, 2.9));
        System.out.println(sum.executar(2,3));

    }
}
