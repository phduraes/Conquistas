package maratona_java;

/**
 * 22 - Estruturas Condicionais pt 03 - Operador ternário
 * String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" :
 * "Vou doar quando me tornar programador";
 */

public class Aula05EstruturaCondicionais03 {

    public static void main(String[] args) {

        //doar se salario > 5000
        double salario = 6000;
        //(condição) ? veradeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Vou doar quando me tornar programador";

        System.out.println(resultado);

    }
}
