package exercicios_java;

import java.util.Scanner;

public class Classificacao_De_Idade {

   public static void main(String[] args) {
        
      Scanner ler = new Scanner(System.in);

      int idade;

      System.out.print("Digite sua idade:");
      idade =  ler.nextInt();

      if(idade <= 12 ) {
        System.out.print("criança!");
      }
      else if( idade <= 17){
        System.out.print("adolescente!");
      }
      else if (idade <= 59){
        System.out.println("Adulto!");
      }
      else if (idade > 59){
        System.out.println("Idoso!");
      }  
      else{
        System.out.println("idade inválida");

      }
      ler.close();
    }
}
