package javacore.introducaoclasses;

/**
 * 42 - Orientação Objetos - Exercício Classes
 * 43 - Orientação Objetos - Referência de objetos
 *  */

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {

    private static Carro carro1;

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "\nFusca Bala ";
        carro1.modelo = "\nSport ";
        carro1.ano = 1969;

        carro2.nome = "\nMustang ";
        carro2.modelo = "\nGT 500 ";
        carro2.ano = 1968;

        carro2 = carro1;

        System.out.printf("\nCarro 1: ");
        System.out.printf(carro1.nome);
        System.out.printf(carro1.modelo);
        System.out.printf(String.valueOf(carro1.ano));

        System.out.printf("\nCarro 2: ");
        System.out.printf(carro2.nome);
        System.out.printf(carro2.modelo);
        System.out.printf(String.valueOf(carro2.ano));



    }
}
