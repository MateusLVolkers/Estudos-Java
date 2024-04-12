package controle;

import java.util.Scanner;

public class EstruturasDeControle {

    public static void main(String[] args) {
        maiorNum();
    }
    public static void ePar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor número inteiro: ");
        int valorRecebido = input.nextInt();

        int verificaPar = valorRecebido % 2;
        if (valorRecebido >=0 && valorRecebido <= 10 && verificaPar == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("Não é par ou não é válido");
        }
        input.close();
    }

    public static void media() {
        Scanner input = new Scanner(System.in);
        int somaNota = 0;
        int contador = 0;

        while (contador < 3) {
            System.out.println("Digite o valor da nota: ");
            somaNota += input.nextInt();
            contador++;
        }
        input.close();
        int media = somaNota / contador;

        switch (media) {
            case 10: case 9: case 8: case 7: case 6:
                System.out.println("Aprovado");
                break;
            case 5: case 4:
                System.out.println("Recuperação");
                break;
            case 3: case 2: case 1: case 0:
                System.out.println("Reprovado");
                break;
        }
    }

    public static void letraPorLetra() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = input.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.print(letra + " ");
        }
        input.close();
    }

    public static void maiorNum() {
        Scanner input = new Scanner(System.in);
        int contador = 1;
        int numeroMaior = 0;

        while(contador <= 5) {
            System.out.println("Digite o número inteiro: ");
            int temp = input.nextInt();
            if (temp > numeroMaior) numeroMaior = temp;
            contador ++;
        }
        System.out.println("Maior número: " + numeroMaior);
        input.close();
    }
}

