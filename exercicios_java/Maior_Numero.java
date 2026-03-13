package exercicios_java;

import java.util.Scanner;

public class Maior_Numero {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int n1;
     int n2;
     System.out.print("Digite um valor:");
     n1 = ler.nextInt();
     System.out.print("Digite outro valor:");
     n2 = ler.nextInt();
     if(( n1 > n2) && (n1 != n2)){
        System.out.println(n1 + " É o maior numero e são diferentes!");
     }
     else if( n2 > n1){
        System.out.println(n2 + " É o maior numero e são diferentes!");
     }
     else if(n1 == n2){
        System.out.println("numeros iguais!");
     }
     ler.close();
   
    } 
}
