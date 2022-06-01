package jedi.project.conquista02;

import java.util.Scanner;

/**
 * Criar um código que verifica se um valor de uma variável é igual a 100.
 * Caso verdadeiro, escrever no console: “Verdadeiro”
 */

public class exercicio01{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.printf(" Digite um numero: ");
        num = input.nextInt();

        if (num == 100)
            System.out.printf(" Verdadeiro ");

        }
}
