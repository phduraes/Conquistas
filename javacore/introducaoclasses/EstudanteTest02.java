package javacore.introducaoclasses;

import javacore.introducaoclasses.dominio.Estudante;

import java.io.PrintStream;

public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Sanji";
        System.out.printf(String.valueOf(estudante.idade));
        System.out.printf(String.valueOf(estudante.sexo));
        System.out.printf(String.valueOf(estudante.nome));

        System.out.printf(String.valueOf(estudante2.idade));
        System.out.printf(String.valueOf(estudante2.sexo));
        System.out.printf(String.valueOf(estudante2.nome));



    }
}
