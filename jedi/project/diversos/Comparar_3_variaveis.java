package jedi.project.diversos;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Comparar_3_variaveis {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.Us);
        Scanner sc = new Scanner(System.in);
        Triangle x,y,z;

        x = new Triangle();
        y = new Triangle();
        z = new Triangle();

        System.out.printf("enter the mensures of triangules X:  ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("enter the mensures of triangules Y:  ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("enter the mensures of triangules Z:  ");
        z.a = sc.nextDouble();
        z.b = sc.nextDouble();
        x.c = sc.nextDouble();

        Double p = (x.a + x.b +  x.c) / 2.0;
        double  areaX = Math.sqrt(p * (p -x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + z.c ) / 2.0;
        double areaY =Math.sqrt( (p * (p - x.a)  * (p - x.b) * (p - x.c)));

        p = (z.a + z.b + z.c) / 2.0;
        double areaZ = Math.sqrt (p * (p - z.a) * (p -z.b) * (p - z.c));

        System.out.printf("Trinagle X area: % 4f%n ", areaX);
        System.out.printf("Trinagle Y area: % 4f%n ", areaY);
        System.out.printf("Trinagle Z area: % 4f%n ", areaZ);

        if (areaX > areaY && areaZ) {
            System.out.printf("Larger area X:   ");

        } else if  ( areaY > areaZ && areaX) {
            System.out.printf("Larger area Y:  ");

        } else if (areaZ > areaX && areaZ > areaY){
                System.out.printf("Larger area Z:  ");

        }

            sc.close();
    }

}


