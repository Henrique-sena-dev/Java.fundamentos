package d_estruturas_condicionais;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int salada = 20;
        int bacon = 22;
        int egg = 24;
        int tudo = 30;
        int burguer = 25;
        int opcao;
        System.out.println("==========menu===========");
        System.out.println("   Escolha seu lanche  ");
        System.out.println("1- X-burguer");
        System.out.println("2- X-salada");
        System.out.println("3- X-bacon"); 
        System.out.println("4- X-egg");
        System.out.println("5- X-tudo");
        System.out.print("Digite um numero de qual opção deseja:");
        opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Voce escolheu x-burguer valor:" + "R$" + burguer );
                
                break;
            case 2:
                System.out.println(" Voce escolheu x-salada valor: r$" + salada);

                break;
            case 3:
                System.out.println("Voce escolheu x-bacon valor: R$" + bacon);
                
                break;
            case 4:
                System.out.println(" Voce escolheu x-egg valor: R$" + egg);

                break;

            default:
                break;
        }

    
    
    
    
    
    
    }
}
