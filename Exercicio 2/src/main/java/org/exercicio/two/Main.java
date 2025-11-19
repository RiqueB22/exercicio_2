package org.exercicio.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o palíndromo: ");
        String palavra = input.nextLine();

        //variables for loop
        int i = 0;
        int j = palavra.length()-1;
        String palindromo = "";

        //Check if is only character
        if(palavra.matches(".*[a-zA-Z].*")){
            //Check if is palindromo
            while(i<palavra.length()){
                if (palavra.charAt(i) != palavra.charAt(j)) {
                    System.out.println("Não é um palindromo");
                    System.exit(400);
                } else {
                    palindromo = "É um palindromo";
                }

                i++;
                j--;
            }

            System.out.println(palindromo);
        }else {
            System.out.println("Envie as palavras e sem caracteres especiais");
        }
    }
}