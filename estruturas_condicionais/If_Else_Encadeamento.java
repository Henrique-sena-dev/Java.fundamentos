
package estruturas_condicionais;
import java.util.Scanner;


public class If_Else_Encadeamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual o horário (ex 14,40):");
        double horario = ler.nextDouble();
        ler.close();
     if(horario < 12 ){ 
        System.out.println("Bom dia");
     }else if (( horario >= 12) && (horario <= 18))
           System.out.println("Boa tarde");
     else { 
         System.out.println("Boa noite");
        }
    }
  
}
   

