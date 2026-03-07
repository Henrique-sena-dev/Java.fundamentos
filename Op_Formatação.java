
import java.util.Locale;

public class Op_Formatação {
    public static void main(String[] args) {
      
        double valor = 10.49856;
        String nome = "lelo";
        int idade = 25;
        double salario = 5.000;

        System.out.printf("%.5f %n", valor);
        System.out.printf("%.2f %n", valor);
        
        System.out.printf("%nMeu nome:%s %nMinnha idade:%d %nMeu salário: %.3f",nome, idade, salario);
        /* 
         * %f = ponto flutuante
         * %d = valor inteiro
         * %s = texto
         * %n = quebra de linha        
         */
        
         Locale.setDefault(Locale.US);
        //default serve para trocar a virgula por ponto, em casos de troca de pais
        System.out.printf("%nResultado = Metros %.2f", valor);
                                          // valor vai pra dentro da formatação
        
     }
    
}
