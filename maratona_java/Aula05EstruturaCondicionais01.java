package maratona_java;

public class Aula05EstruturaCondicionais01 {

    public static void main(String[] args) {

        int idade = 14;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida != false) {

            System.out.printf("\nAutorizado a comprar bebidas alcoolicas ");

        } else {
            System.out.printf("\n Nao autorizado a comprar bebidas alcoolicas ");
        }

        if (isAutorizadoComprarBebida == false) {

            System.out.printf("\n Nao autorizado a comprar bebidas alcoolicas ");
        }

    }

}
