package iniciais;

import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var valor1 = sc.nextInt();
        var valor2 = sc.nextInt();
        var produto = valor1 * valor2;

        System.out.println("PROD = " + produto);

        sc.close();
    }
}
