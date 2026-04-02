package iniciais;

import java.util.Scanner;
import  java.util.Locale;

public class BEE1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
    }
}
