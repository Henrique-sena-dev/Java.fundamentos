package a_entrada_dados;
import java.util.Scanner;

public class Teste_Scanner {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.print("digite seu nome:");
        String nome = ler.nextLine();

        /*String x;
        x = ler.next();
        System.out.println("vc digitou:" + x);*/
        
        ler.close();
   
        System.out.println("nome:" + nome);   
    }
}