package w_exercicios_java;

import java.util.Scanner;

public class FuncoesParaString {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        String UsuarioSenha = "admin";
        
        System.out.print("digite sua senha:");
        String senha = ler.nextLine().trim();

        if ( senha.equalsIgnoreCase(UsuarioSenha)) { 
            System.out.println("acesso liberado");
            
        }
        else{
            System.out.println("senha invalida");
        }
        ler.close();
        /*
         * .toLowerCase(); = para tratar letra minuscula
         * .toUpperCase(); = para tratar letra maiuscula
         * .tri(); = para limpar espaços
         */




    }
}