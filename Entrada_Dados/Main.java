package Entrada_Dados;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = ler.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);

        ler.close();
    }
}
