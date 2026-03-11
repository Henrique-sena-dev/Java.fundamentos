package Processamento_Atribuição;
public class Class_Math {
    public static void main(String[] args) {
     
     double a = 4.8; 
     int r1 = (int) Math.round(a); // Math.round aredonda de forma aritimética 
     System.out.println(r1);
   
     double b = 4.8; 
     int r2 = (int) Math.floor(b); // Math.floor aredonda pra baixo
     System.out.println(r2);   
    
     double c = 4.8; 
     int r3 = (int) Math.round(c); // Math.round aredonda pra cima
     System.out.println(r3);    

     double d = -4.8; 
     int r4 = (int) Math.abs(d); // Math.abs valor absoluto
     System.out.println(r4);    
     
     double ale = Math.random(); // Math.random gerar numero aleatorio de 0.0 a 1.0
     int n = (int) (5 + ale * (10-5)); // metodo pra gerar outro numeros aleatorio
     System.out.println(n);
    }
}
