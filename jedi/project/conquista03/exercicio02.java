package jedi.project.conquista03;
/**
        * Criar um código que pede para o usuário inserir um valor numérico de 1 a 10,
        * e caso o valor digitado seja diferente desse intervalo, ele deve exibir uma mensagem
        * pedindo para inserir o valor correto.
        * O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO COLOCAR O VALOR CORRETO.
        */

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner in = new  Scanner (System.in);

            int numero = 0;
            while (numero <= 10) {

                System.out.printf(" Digite o numero: ");
                numero = in.nextInt();

                if (numero >= 10) {
                    System.out.printf("Voce acertou! \n ");

                } else {
                    System.out.printf("Erroouuu, digite numero no intervalo de 0 a 10: \n ");
                }
            }
    }

}
