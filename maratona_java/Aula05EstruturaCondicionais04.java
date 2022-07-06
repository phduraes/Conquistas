package maratona_java;

/**
 * 24 - Estruturas Condicionais pt 05 - Resolução do exercícios
 *
 */
public class Aula05EstruturaCondicionais04 {

    //Income	Tax rate  (%)
    //Below     €69,398  37.07%
    //Above     €68,398	 49.5%
    //          €68,508

    public static void main(String[] args) {

        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712) {

            valorImposto = salarioAnual * primeiraFaixa;

        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {

            valorImposto = salarioAnual * segundaFaixa;

        } else {

            valorImposto = salarioAnual * terceiraFaixa;

        }

        System.out.printf(String.valueOf(valorImposto));


    }
}
