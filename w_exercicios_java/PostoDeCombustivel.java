package w_exercicios_java;

import java.util.Scanner;

public class PostoDeCombustivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double preco_original_gasolina = 5.50;
        double desconto_gasolina = 0;
        double preco_final_gasolina = 0;
        double preco_original_alcool = 3.90;
        double desconto_alcool = 0;
        double preco_final_alcool = 0;
       
        System.out.println("======== posto ========");
        System.out.println("1- Alcool ");
        System.out.println("2- Gasolina ");
        System.out.print("Qual opção deseja:");
        int opcao = ler.nextInt();
        ler.nextLine();

        switch (opcao) {
            case 1:
               System.out.print("quantos litros de Alcool?");
               int li_alcool = ler.nextInt();
                if (li_alcool < 20) {
                     preco_original_alcool = preco_original_alcool * li_alcool;
                     desconto_alcool = preco_original_alcool  * 0.03;
                     preco_final_alcool = preco_original_alcool - desconto_alcool;
                     System.out.printf("valor com desconto %.2f%n", preco_final_alcool);
                }
                else if (li_alcool > 20) {
                     preco_original_alcool = preco_original_alcool * li_alcool;
                     desconto_alcool = preco_original_alcool  * 0.05;
                     preco_final_alcool = preco_original_alcool - desconto_alcool;
                     System.out.printf("valor com desconto %.2f%n", preco_final_alcool);  
                     }
                break;
            case 2:
              System.out.print("Quantos litros de Gasolina? ");    
              int li_gasolina = ler.nextInt();
                if (li_gasolina < 20) {
                    preco_original_gasolina = preco_original_gasolina * li_gasolina;
                    desconto_gasolina = preco_original_gasolina * 0.03;
                    preco_final_gasolina = preco_original_gasolina - desconto_gasolina;
                    System.out.printf("valor com desconto de %.2f%n",preco_final_gasolina);
                }
                if (li_gasolina > 20) {
                    preco_original_gasolina = preco_original_gasolina * li_gasolina;
                    desconto_gasolina = preco_original_gasolina * 0.05;
                    preco_final_gasolina = preco_original_gasolina - desconto_gasolina;
                    System.out.printf("valor com desconto de %.2f%n",preco_final_gasolina);

                    
                }
             ler.close();   
               
             default:
                break;
        }
    }
    
}
