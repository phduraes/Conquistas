package jedi.project.conquista01;

/**
 * Criar um código que declara e inicializa variáveis primitivas e atribui o seu
 * próprio valor somado a ele mesmo
 * utilizando operadores de atribuição direta (+=, -=, *=...)
 */
public class Exercicio08 {

    public static void main(String[] args) {

        int quantidadedeAnos = 40;
        int horasTrabalhadas = 30;
        int valorHora = 100;
        int salario = 0;

        if (quantidadedeAnos <= 40)  {

            salario = 1500 + (valorHora * horasTrabalhadas);
        }
        else if ((quantidadedeAnos > 1)   && (quantidadedeAnos < 3 ) ) {

            salario = 2000 + (valorHora * horasTrabalhadas);
        }
        else {
            salario = 3000 + (valorHora * horasTrabalhadas);

        }
        System.out.printf(String.valueOf(salario));
    }
}

