package iniciais;

import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var A = sc.nextInt();
        var B = sc.nextInt();
        var soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
