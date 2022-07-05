package maratona_java;

public class Aula05EstruturaCondicionais {

    public static void main(String[] args) {

        int idade = 36;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {

            System.out.printf("\nAutorizado a comprar bebidas alcoolicas ");
        }

        if (isAutorizadoComprarBebida == false) {

            System.out.printf("\n Nao autorizado a comprar bebidas alcoolicas ");
        }


    }
}
