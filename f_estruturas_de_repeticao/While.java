package f_estruturas_de_repeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
       
        System.out.print(" Digite um numero de 1 ao 10 para saber a tabuada:");
        int numero = ler.nextInt();
        
        int contador = 1;
        int res = 0;

        while (contador <= 10) {
            res = numero * contador;
            System.out.println(numero + " x " + contador + " = " + res);
            contador += 1;

        }
        ler.close();

    }

}
