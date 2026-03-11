package exercicios;

import java.util.Scanner;

public class Positivo_Negativo {
     public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int valor;
     String resultado;
     System.out.print("Digite um número:");
     valor = ler.nextInt();
     resultado = (valor < 0)?"negativo":"positivo";
     System.out.println("O número digitado é: " + resultado);
     
    
     ler.close(); 


    }
    
}