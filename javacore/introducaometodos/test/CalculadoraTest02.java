package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

/**
 * 45 - Orientação Objetos - Métodos pt 02 - Parâmetros
 */

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multipicaDoisNumeros(21, 2);

    }
    public voi multiplicaDoisNumeros(int num1, float num2) {

        System.out.printf(String.valueOf(num1 * num2));
        return null;
    }

    public double divideDoisNumeros (double num1, double num2) {

        return 0;
    }

}
