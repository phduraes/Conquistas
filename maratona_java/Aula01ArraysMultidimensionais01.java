package maratona_java;


/**
 *
 *  36 - Arrays Multidimensionais pt 01
 * 1,2,3,4,5 meses
 * 31,28,31,30 dias
 */
public class Aula01ArraysMultidimensionais01 {

    public static void main(String[] args) {

        int[][] dias  = new int[3][3];

        dias[0][0] = 31;
        dias[1][1] = 28;
        dias[2][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.printf(String.valueOf(dias[i][j]));

            }

        }


//        System.out.printf(String.valueOf(dias[0][0]));





    }
}
