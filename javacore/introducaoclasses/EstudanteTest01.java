package javacore.introducaoclasses;

/**
 *
 * 40 - Orientação Objetos - Introdução classes pt 02
 */

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.printf(estudante.nome);
        System.out.printf(String.valueOf(estudante.idade));
        System.out.printf(String.valueOf(estudante.sexo));


    }
}
