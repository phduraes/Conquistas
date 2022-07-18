package IntroducaoJavaCore;

/**
 * 27 - Estruturas de Repetição pt 01 - Laços de repetição while, do while, for
 * Contagem de 1 a 10...
 */
public class Aula06EstruturasDeRepetição01 {
    // WHILE, DO WHILE, FOR

    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            System.out.printf(String.valueOf(++count));


        } count = 0;

        do {
            System.out.printf("dentro do do-while"+ ++count);

        } while (count < 10);

        for (int i =0; i < 10; i++) {
            System.out.printf("for " +i);
        }
    }
}
