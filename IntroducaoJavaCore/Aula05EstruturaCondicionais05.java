package IntroducaoJavaCore;
/**
 * 25 - Estruturas Condicionais pt 06 - Switch
 * <p>
 * Imprima o dia da semana, considerando 1 como domingo
 */
public class Aula05EstruturaCondicionais05 {

    public static void main(String[] args) {

        byte dia = 7;
        // char, int, byte, enum, String

        switch (dia) {

            case 1:
                System.out.printf("\nDomingo");
                break;
            case 2:
                System.out.printf("\nSegunda");
                break;
            case 3:
                System.out.printf("\nTerça");
                break;
            case 4:
                System.out.printf("\nQuarta");
                break;
            case 5:
                System.out.printf("\nQuinta");
                break;
            case 6:
                System.out.printf("\nSexta");
                break;
            case 7:
                System.out.printf("\nSabado");
                break;
            default:
                System.out.printf("\nOpcao Invalida");
                break;

        }

        char sexo = 'F';
        switch (sexo) {
            case 'M':
            System.out.printf("\nHomem");
            break;

            case 'F':
                System.out.printf("\nMulher");
                break;

            default:
                System.out.printf("Invalido");
                break;




        }
    }
}
