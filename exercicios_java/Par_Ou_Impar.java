package exercicios_java;

import java.util.Scanner;

public class Par_Ou_Impar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        String resultado;
        System.out.print("Digite um número para saber se é par ou ímpar:");
        numero = ler.nextInt();
        resultado =(numero % 2 == 0)?"par":"impar";
        System.out.printf("o número " + numero +" é " + resultado);
    }
}

