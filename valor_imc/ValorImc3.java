package valor_imc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorImc3 {

    public static void main(String[] args) {

        //variaveis
        double peso,altura,imc;
        //objetos

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.printf("Calculo IMC! \n");

        //entrada
        System.out.printf("Digite o seu peso: ");
        peso = teclado.nextDouble();

        System.out.printf("Digite o seu altura: ");
        altura = teclado.nextDouble();

        //Processamento:
        imc = peso / (altura * altura);

        //saída

        System.out.printf("IMC:  " + formatador.format(imc));

        teclado.close();

        //classificação

        if (imc <18.5) {

            System.out.printf("abaixo do peso");

        } else  if (imc < 25 ) {
            System.out.printf("Peso ideal ");

        } else  if (imc < 30 ) {
            System.out.printf("Levemente acima do peso");

        } else  if (imc < 35 ) {
            System.out.printf("Obesidade grau I ");

        } else  if (imc < 40 ) {
            System.out.printf("Obesidade grau II - Severa ");

        } else {
            System.out.printf("Obesidade grau III - Morbida ");
        }
    }
}
