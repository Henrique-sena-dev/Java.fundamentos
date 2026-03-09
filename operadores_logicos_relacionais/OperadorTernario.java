package operadores_logicos_relacionais;

import java.util.Locale;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     Locale.setDefault(Locale.US);
     
     System.out.print("digite um valor:");
     double valor1 = ler.nextDouble();
     ler.nextLine();
     System.out.print("digite outro valor:");
     double valor2 = ler.nextDouble();
     double resultado;
     ler.close();
     resultado = (valor1 >= valor2)? valor1:valor2; /*quando quiser fazer a comparação
                                                      de conteudo que esta dentro objetos usar ex: 
                                                      ( valor1.equals(valor2)) e nao == */
     System.out.printf("%.1f",resultado);
     
    }
    
}
