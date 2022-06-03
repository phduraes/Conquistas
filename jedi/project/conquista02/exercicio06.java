package jedi.project.conquista02;

import java.util.Scanner;

/**
 * Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case
 * (a, b, c e default). O código deve executar apenas o default com a mensagem:
 * “O valor não é compatível”.
 */
public class exercicio06 {

    public static void main(String[] args) {
        Scanner entranda = new Scanner(System.in);

        int ConsultaMedica;

        System.out.printf(" Marque do dia da sua consulta: ");
        ConsultaMedica = entranda.nextInt();

        switch (ConsultaMedica){

            case 1:
                System.out.printf(" Segunda--feira as 11 hs = Disponivel ");
                break;

            case 2:
                System.out.printf(" Terça-feira as 09 hs: Disponivel ");
                break;

            case 3:
                System.out.printf(" Quarta-feira as 07 hs: disponivel ");
                break;

            case 4:
                System.out.printf(" Quinta-feira as 14 hs: disponivel  ");
                break;

            case 5:
                System.out.printf(" Opcao Invalida!");
        }
    }

}
