package org.exercicio.two;

import java.util.Scanner;

// programa que verifica se uma palavra palindromo
// author: Henrique Bernardo

public class Main {
    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o palíndromo: ");
        String palavra = input.nextLine();

        //variaveis do loop
        int i = 0;
        int j = palavra.length()-1;

        //checa se tem só caracteres e numeros
        if(palavra.matches(".*[a-zA-Z0-9].*")){
            //Faça enquento o j < que o tamanho da palavra
            while(i<palavra.length()){
                //Checa posições antagonicas da string
                if (palavra.charAt(i) != palavra.charAt(j)) {
                    System.out.println("Não é um palindromo");
                    return;
                }

                i++;
                j--;
            }

            System.out.println("É um palindromo");
        }else {
            System.out.println("Envie as palavras e sem caracteres especiais");
        }
    }
}