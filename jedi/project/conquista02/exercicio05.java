package jedi.project.conquista02;

/**
 * Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável
 * é igual ao case (1, 2, 3). Os cases devem escrever quando o valor for igual ao seu próprio.
 * Mostrando apenas a frase do case referente ao valor.
 */
public class exercicio05 {

    public static void main(String[] args) {

        int user = 18;

        switch (user) {

            case 18 :
                System.out.println("Voce tem 18 anos");
                break;

            case 19:
                System.out.printf("Voce tem 19 anos");
            break;

            case 20 :
                System.out.printf("Voce tem 20 anos");

            default:
                System.out.printf("Voce nao tem 18, 19 ou 20 anos");
        }

    }

}