package javacore.introducaoclasses;


/**
 *
 * 41 - Orientação Objetos - Coesão
 */

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.printf("Nome: "+ professor.nome + "\nIdade: "+professor.idade + "\nsexo: " +professor.sexo);

    }

}
