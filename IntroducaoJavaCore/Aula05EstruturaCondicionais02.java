package IntroducaoJavaCore;

public class Aula05EstruturaCondicionais02 {

    public static void main(String[] args) {
        // idade < 15 categoria juvenil
       // idade >= 15 && idade < 18 categoria juvenil
       // idade >= 18 18 categoria adulto

        int idade = 16;
        String categoria;


        if(idade < 15) {
            categoria = "\n Categoria infantil ";
        
        } else if (idade >= 15 && idade < 18) {
            categoria = "\n Categoria juvenil ";
            
        } else {
             categoria = "\n Categoria adulto ";

         }
        System.out.printf(categoria);

    }

}
