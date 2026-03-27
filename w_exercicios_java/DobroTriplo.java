package w_exercicios_java;

import java.util.Scanner;

public class DobroTriplo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro:");
        int numero = ler.nextInt();
        int dob = numero *2;
        int tri = + numero *3;

        if (numero == 0) {
            System.out.println("numero = " + numero);

        }
        else if (numero < 0) {
            System.out.println(numero + " é negativo");
            
        }
        else {
            System.out.println("positivo");
            System.out.println("o dobro de " + numero + " = " + dob);
            System.out.println("o triplo de " + numero + " = " + tri); 
            
        }
            
        
        ler.close();

    }
}