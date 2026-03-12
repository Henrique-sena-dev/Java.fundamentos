package e_operadores_logicos_relacionais;

public class OperadoresLogicos {
    public static void main(String[] args) {
      int a = 8;
      int b = 4;
      int c;
      c = !((a <= b) && (a != b)) ^ (a > b)?1:2;
      System.out.println("resultado verdadeiro >1<");
      System.out.println("resultado falso >2<");
      System.out.println("o resultado da operação é " + c);



    }
}
