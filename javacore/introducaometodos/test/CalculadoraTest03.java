package javacore.introducaometodos.test;

/**
 * 46 - Orientação Objetos - Métodos pt 03 - Retorno pt 01
 */

import javacore.introducaometodos.dominio.Calculadora;

import static java.lang.String.*;

public class CalculadoraTest03 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result =  calculadora.divideDoisNumeros(20, 2);
        System.out.printf(valueOf(result));
        System.out.printf(valueOf(calculadora.divideDoisNumeros(20, 2)));
    }
}
