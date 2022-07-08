package maratona_java;

/**
 * 26 - Estruturas Condicionais pt 07 - Switch exercício
 * Utilizando switch e dados os valores de 1 a 7m, impirmia se é dia util o fnal de semana
 * Conseiderando 1 como domingo
 */
public class Aula05EstruturaCondicionais06 {

    public static void main(String[] args) {

        byte dia = 5;
        switch (dia ) {

            case 1:
            case 7:
                System.out.printf("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.printf("Dia util");
                break;
            default:
                System.out.printf("Opcao Invalida");
                break;

        }


    }

}
