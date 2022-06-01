package jedi.project.conquista02;

/**
 * Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
 * não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE
 */
public class exercicio03 {

    public static void main(String[] args) {
        int primeiro = 8, segundo = 3, terceiro = 9, MAIOR;

        if (primeiro >= segundo) {

            if (primeiro >= terceiro) {

                MAIOR = primeiro;
            }
                else {
                    MAIOR = terceiro;
            }
        } else {
            if (segundo >= terceiro) {
                MAIOR = segundo;
            }
                else {
                    MAIOR = terceiro;
            }
        }
        System.out.printf("O MAIOR número é: " +MAIOR);
    }
}






