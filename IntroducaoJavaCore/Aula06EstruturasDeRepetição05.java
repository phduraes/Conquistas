package IntroducaoJavaCore;

/**
 * 31 - Estruturas de Repetição pt 05 - Continue
 * Dado o valor de um carro, descubra em quantas ele pode ser parcelado
 * Condição da valorParcela >= 1000
 *
 */

public class Aula06EstruturasDeRepetição05 {

    public static void main(String[] args) {


        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.printf("\n Parcela " + parcela + "\n  R$ " + valorParcela);

        }
  }
}
