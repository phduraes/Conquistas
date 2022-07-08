package maratona_java;

/**
 * 28 - Estruturas de Repetição pt 02 - Exercício for
 * Imprima todos os pares de 0 a 1000
 */
public class Aula06EstruturasDeRepetição02 {

    public static void main(String[] args) {

        for (int i = 1; i <=100; i++){

            if(i % 2 == 0) {
                System.out.printf(String.valueOf(i));
            }
        }

    }
}
