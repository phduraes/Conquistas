package maratona_java;

import javax.sound.midi.Soundbank;

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



        System.out.printf("\n isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.printf("\n isDezIgualVinte " +isDezIgualVinte);
        System.out.printf("\n isDezIgualDez" +isDezIgualDez);
        System.out.printf("\n isDezdiferenteDez" +isDezIgualDez);


        //  && (and) || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 & salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 & salario >= 3381;
        System.out.printf("\n isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.printf("\n isDentroDaLeiMenorQueTrinta" +isDentroDaLeiMenorQueTrinta);



        double valorTotalContaCorrente = 5000;
        double valorTotalContaPoupanca = 100000;
        float valorPlaystation = 4500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorPlaystation > valorPlaystation;
        System.out.printf(" \n isPlaystationCincoCompravel " +isPlaystationCincoCompravel);



        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.printf(String.valueOf(bonus));


        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        //int contador2 = 0;
        System.out.printf(String.valueOf(contador));




    }
}
