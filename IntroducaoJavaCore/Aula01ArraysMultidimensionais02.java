package IntroducaoJavaCore;

/**
 *
 * 38 - Arrays Multidimensionais pt 03 - Inicialização
 *
 */


public class Aula01ArraysMultidimensionais02 {

    public static void main(String[] args) {

        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3,};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int [][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,56,6}};

        for (int[] arrayBase: arrayInt) {
            System.out.printf("\n");
            for (int num: arrayBase) {
                System.out.printf(String.valueOf(num));

            }
        }

    }
}
