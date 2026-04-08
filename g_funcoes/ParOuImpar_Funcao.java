package g_funcoes;

import java.util.Scanner;

public class ParOuImpar_Funcao {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);    
       
       System.out.print("Digite um numero:");
       int n = ler.nextInt();
       int ImparPar = res( n);
       MostrarResultado(ImparPar);
       

       ler.close();

       
    }
      
     public static int res( int b) { 
      int r;
      if (b % 2 == 0) {
        r = 0;
         
        } 
        else 
         r = 1;
      
     return r;
     }
     
     public static void MostrarResultado(int mostrar){
      if (mostrar == 0) {
          System.out.println("numero digitado é par");

         
      }
      else 
         System.out.println("numero digitado é impar"); 
     

     }
     
     
     
    
    
}
