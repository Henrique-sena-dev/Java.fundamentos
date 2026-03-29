package g_funcoes;

import java.util.Scanner;

public class MaiorNumero_Funcao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite tres numeros:");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();

        int NumberMaior = max( a, b, c);
        ler.close();

        System.out.println("maior numero digitado " + NumberMaior);

    }
    
      public static int max (int x  ,int y ,int z) {
        int r;
        if (x > y && x > z) {
             r = x;
            
        }
        else if (y > z) {
             r = y;
            
        }
        else { 
            r = z;
        }
        return r;
     }
     
    
}
    




