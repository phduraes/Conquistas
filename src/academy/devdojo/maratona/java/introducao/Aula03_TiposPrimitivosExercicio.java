package academy.devdojo.maratona.java.introducao;

import java.sql.SQLOutput;
/*
Pratica
Crie variaveis para os campos descrios abaixo entre <> e imprima a seguine mensagem:
Eu <nome>, morando no endereço <endereço> confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03_TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = " Phduraes ";
        String endereco = " Qd Central Bloco A ";
        double salario = 4500.20;
        String dataRecebimentoSalario = " 20/12/2022 ";
        String relatorio = "Eu " +nome+ ", morando no endereco:" +endereco+", confirmo que recebi o salario de " +salario+ ", na data de " +dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}

