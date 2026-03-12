package b_processamento_atribuicao;
public class Casting {
    public static void main(String[] args) {
     
     double x = 9.00;
     int e = (int) x; // atribuição com CASTING
     System.out.println(e);
     
     String y = "9";
     int a = Integer.parseInt (y); // atribuição com integer
     System.out.println(a);
     
     int c = 5;
     String r = Integer.toString(c); // atribuição com integer
     System.out.println(r);
         
    }
}


