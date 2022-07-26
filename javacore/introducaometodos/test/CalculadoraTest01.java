package javacore.introducaometodos.test;

/**
 *
 *  44 - Orientação Objetos - Métodos pt 01
 */

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.printf("\nFinalizano Calculadora Test01 ");

        calculadora.subtraiDoisNumeros();

    }
}
