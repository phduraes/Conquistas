package jedi.project.diversos;

public class Loop_While {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;
        System.out.printf(" Contando ate " + max);

        while (i <= max) {
            System.out.printf(" \n Valor de i " +i);
            i++; // i = i +1; ou i += 1;
       }
        System.out.printf(String.valueOf(i));

        do {

            i++;
            System.out.printf(" \n valor de i: " + i);

        } while (i <13);
            System.out.printf(String.valueOf(i));

    }

}
