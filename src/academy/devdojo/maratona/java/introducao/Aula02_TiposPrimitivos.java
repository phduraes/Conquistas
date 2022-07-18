package academy.devdojo.maratona.java.introducao;

import java.util.stream.StreamSupport;

public class Aula02_TiposPrimitivos {

        public static void main(String[] args) {
            // int, double, float, char, byte, short, log, bollean
            int  idade = (int) 100000000L;
            long numeroGrande = 10000000;
            double salarioDouble = 2000;
            float salarioFloat = 2500;
            byte idadeByte = -128;
            short idadeShort = 32000;
            boolean verdadeiro = true;
            boolean falso = false;
            char caractere = '\u0041';
            String nome =  "Goku";
            var nome2 = "vegetal";

            System.out.println("a idade e:" +idade+ " anos");
            System.out.println(falso);
            System.out.println("char" +caractere);
            System.out.println(idade);
            System.out.println("oi meu nome é" +nome);


        }
}
