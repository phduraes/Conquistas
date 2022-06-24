package jedi.project.conquista05;

import java.util.Arrays;

/**
Criar um array de tipo inteiro de 100 posições que vai receber valores de 0 a 100.
Inicializar esse valores usando um laço de Repetição.
E utilizando o foreach, printar todos os valores multiplicando por 2.
 */

public class exercicio02 {

    public static void main(String[] args) {

       int a1[] = {100};
       int a2[] = {2};

       String result = "";

       for (int i = 0; i < a1.length; i++) {

           result += Integer.toString(a1[i] * a2[i]) + " ";
       }

        System.out.printf(result);
    }


}
