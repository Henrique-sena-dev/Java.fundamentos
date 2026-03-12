package b_processamento_atribuicao;

import java.util.Scanner;

public class Atribuicao_Cumulativa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor = 50;
        int minutos;
        System.out.print("Quantos minutos foram gastos?");
        minutos = ler.nextInt();
        if(minutos > 100){
          valor += (minutos - 100) * 2;
          System.out.println("valor do plano: " + valor);
           // Operador curto | Forma completa// |
          /*| -------------- | -------------- |
           *| `a += b`       | `a = a + b`    |
           *| `a -= b`       | `a = a - b`    |
           *| `a *= b`       | `a = a * b`    |
           *| `a /= b`       | `a = a / b`    |
           *| `a %= b`       | `a = a % b`    |
           */
        }
    }
}

