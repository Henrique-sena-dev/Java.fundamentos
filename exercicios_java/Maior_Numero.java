package exercicios_java;

import java.util.Scanner;

public class Maior_Numero {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int n1;
     int n2;
     int res;
     System.out.print("Digite um valor:");
     n1 = ler.nextInt();
     System.out.print("Digite outro valor:");
     n2 = ler.nextInt();
     res =(n1 > n2)?n1:n2;
     System.out.println("maior numero:" + res);
     ler.close();
   


 
    } 
}
