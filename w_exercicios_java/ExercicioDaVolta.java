package w_exercicios_java;

import java.util.Scanner;

public class ExercicioDaVolta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        
        System.out.print(" digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print(" digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        System.out.print(" possui cnh: ");
          String cnh = ler.nextLine();

          

         if (cnh.equals("sim")) {
            System.out.printf(" %n nome: %s %n idade: %d %n cnh : possui cnh %s " ,nome,idade);
            
         }
         else{
            System.out.printf(" %n nome: %s %n idade: %d %n cnh : não possui cnh %s" , nome, idade);

         }
           
            
          


         

        ler.close();
        
       


    }
    
}
