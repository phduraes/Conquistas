package jedi.project.conquista02;

/**
 * Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
 * sendo atendida na segunda condição, não executando a terceira e nem um ELSE
 */
public class exercicio04 {

    public static void main(String[] args) {

        double salario_anual = 5000000;
        double primeira_faixa = 9.70 / 100;
        double segunda_faixa = 37.35 / 100;
        double terceira_faixa = 49.50 / 100;
        double valor_imposto;

        if (salario_anual <= 34712) {
            valor_imposto = salario_anual * primeira_faixa;

        } else if (salario_anual >= 34713 && salario_anual <= 68507) {

            valor_imposto = salario_anual * segunda_faixa;

            }else {

                valor_imposto = salario_anual * terceira_faixa;
            }

             System.out.printf(String.valueOf(salario_anual));
        }

    }

