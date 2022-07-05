package maratona_java;

public class Aula04Operadores {

    public static void main(String[] args) {

        // + - * /

        int numero01 = 10;
        int numero02 = 20;
        int resultado = (int) (numero01 / (double) numero02);

       System.out.printf(String.valueOf(resultado));

       // %
        int resto = 21 % 7;
        System.out.printf(String.valueOf(resto));

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezdiferenteDez = 10 != 10;



        System.out.printf(" isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.printf(" isDezIgualVinte " +isDezIgualVinte);
        System.out.printf(" isDezIgualDez" +isDezIgualDez);
        System.out.printf(" isDezdiferenteDez" +isDezIgualDez);













    }
}
