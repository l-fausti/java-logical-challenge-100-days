package iniciais;

import java.util.Scanner;
import java.util.Locale;

public class BEE1002 {
    public static void main(String[] args) {
        // Define o padrão de ponto americano para não dar erro com vírgula
        Locale.setDefault(Locale.US);

        System.out.println("Vamos calcular a área de um círculo ⭕");

        System.out.println("Informe um número:");

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double expoente = 2;
        double n = 3.14159;

        double area = n * Math.pow(raio, expoente);;

        // %f = float/double
        // .4 = 4 casas decimais
        // %n ou \n = quebra de linha
        System.out.printf("A=%.4f%n", area);

        sc.close();

    }
}
