package maratona_java;

public class Aula02TiposPrimitivos {

    //int, double, float, char, byte, short, long., boolena

    public static void main(String[] args) {
        int idade = (int) 1000000000L;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = " Goku";
        var nome2 = "Vegetal" +
                       System.out.printf(String.valueOf(" a idade e de " + idade + " anos"));
        System.out.printf(String.valueOf(verdadeiro));
        System.out.printf(String.valueOf(falso));
        System.out.printf("char " + caractere);
        System.out.printf(String.valueOf(idade));
        System.out.printf(String.valueOf(salarioFloat));
        System.out.printf("\n oi meu nome e " +nome);

    }


}
