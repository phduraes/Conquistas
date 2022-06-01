package jedi.project.diversos;


import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num1, num2 = 1, soma, subtracao, multi, divi;

        System.out.printf("Insira um numero: \n");
        num1 = in.nextInt();

        soma = num1 + num2;
        System.out.printf("O resultado da some e: \n ");

        subtracao = num1 - num2 ;
        System.out.printf("O resultado da subtracao e: \n");

        multi = num1 * num2;
        System.out.printf("O resultado da multiplicao e \n");

        divi = num1 / num2;
        System.out.printf("O resultado da divisao e: ");
    }
}
