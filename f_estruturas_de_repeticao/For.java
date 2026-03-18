package f_estruturas_de_repeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int numero = ler.nextInt();
        int res = 0;
    
        for (int i=1; i <= 10; i++ ){
            res = numero * i;
            System.out.println(numero + " x " + i + " = " + res);
           
            
        }
        ler.close();
    }
}
