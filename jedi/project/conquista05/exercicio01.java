package jedi.project.conquista05;

import java.io.PrintStream;

/**
Criar um array do tipo String de 10 posições e inicializar.
Para cada iteração do for, o valor da posição deve ser
concatenado ao valor da variável ex:
Nome
Nome nome
Nome nome casa

 */

    public class exercicio01 {


    public static void main(String[] args) {

        String [] nomes = new String[5];

        nomes[0] = "Panda \n";
        nomes[1] = "Gordo \n";
        nomes[2] = "Kamy \n";
        nomes[3] = "Neve \n";
        nomes[4] = "Goku \n";

        for (int posicaoVetor = 0; posicaoVetor <5; posicaoVetor++) {
            System.out.printf(nomes[posicaoVetor]);
        }
 }

}
