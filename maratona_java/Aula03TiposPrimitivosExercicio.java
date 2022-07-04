package maratona_java;


import java.io.PrintStream;

/**
 * crie varivaeis para os compos descritos abaixo enre <> e imprima
 * a seguinte mensagem:
 * em </nome>, mornado no endereço <endereco>
 *     confirmo que recebei o <salario>, na </data>
 * </endereco>
 *     * */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "Phduraes";
        String endereco = "Av. Rico da Fe";
        double salario = 5400.00F;
        String dataRecebimentoSalario = "20/12/2021";

        String relatorio = "Eu, " + nome + ", morando no endereco: " + endereco + "\nconfirmo que recebi o salario de R$" + salario + ", \nna data de: " + dataRecebimentoSalario;
        PrintStream printf = System.out.printf(relatorio);


    }


}
