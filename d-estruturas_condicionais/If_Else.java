package estruturas_condicionais;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int ano = 2026;
      System.out.print("Em que ano voce nasceu: "); 
      int nasc = ler.nextInt();
      int resultado = ano - nasc;
      System.out.println("Voce tem, " + resultado + " anos.");  
      ler.close();
      if (nasc >= 18) {
         System.out.println("E é maior de idade.");
      }else {
         System.out.println(" E é menor de idade.");
        }    

    }
}
