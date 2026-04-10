package iniciais;

import java.util.Scanner;

public class BEE1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var count = 0;

        for (int i = 0; i < n; i++){
            count++;
            System.out.printf("%d %d %d PUM%n", count, count + 1, count + 2);
            count +=3;
        }
    }
}
