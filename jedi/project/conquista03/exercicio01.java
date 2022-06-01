package jedi.project.conquista03;

/**
 * Criar um código que declara uma variável do tipo boolean para a condição do while e
 * declarar uma variável int iniciando com valor 0.
 * Essa variável deve ser incrementada a cada iteração do while, e quando o valor chegar a 10,
 * a execução do  while deve parar e printar o valor no console.
 */
public class exercicio01 {

    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {

            System.out.printf(String.valueOf(++count));
            //count = count +1;
            //count += 1;
            //count++;
        }
        count = 0;

        do {
            System.out.printf(" do-while \n " + ++count);

        } while (count < 10);

        for (count=0; count < 10; count++ );{

            System.out.printf("for " +count);
        }

    }
}



