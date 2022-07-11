package maratona_java;

/**
 *
 * 33 - Arrays pt 02
 * 34 - Arrays pt 03
 *
 */
public class Aula07Arrays02 {

    public static void main(String[] args) {

        // byte, short, int, long, float, e double 0
        // char '\u0000' ''
        // boolena false
        // String null

        String [] nomes = new String [4];
        nomes[0] = "\n Goku";
        nomes[1] = "\n Kurosaki";
        nomes[2] = "\n Luffy";
        nomes[3] = "\n Hinata";


        for (int i = 0; i < nomes.length; i++) {
            System.out.printf(nomes[i]);

        }

        nomes = new String[4];

    }
}
