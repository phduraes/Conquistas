package maratona_java;

/**
 *
 * 30 - Estruturas de Repetição pt 04 - Exercício Break
 * Dado o valor de um carro, descubra em quantas ele pode ser parcelado
 * Condição da valorParcela >= 1000
 */

public class Aula06EstruturasDeRepetição04 {

    public static void main(String[] args) {

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.printf(" \n Parcela " + parcela+ "R$  " +valorParcela);

            } else {
                 break;
            }
            System.out.printf("\n Fora do if, mas dentro do for " +parcela);
        }



    }
}
