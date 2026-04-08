package iniciais;
import java.util.Scanner;


public class BEE1131 {
    static int victoryInter = 0;
    static int victoryGremio = 0;
    static int empates = 0;
    static int totalGrenais = 0;

    public static void main(String[] args) {
        Scanner scPrincipal = new Scanner(System.in);
        int decision;

        do {
            games(scPrincipal);
            totalGrenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            decision = scPrincipal.nextInt();

        } while (decision == 1);

        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + victoryInter);
        System.out.println("Gremio:" + victoryGremio);
        System.out.println("Empates:" + empates);

        if (victoryInter > victoryGremio) System.out.println("Inter venceu mais");
        else if (victoryGremio > victoryInter) System.out.println("Gremio venceu mais");
        else System.out.println("Nao houve vencedor");

        scPrincipal.close();
    }

    public static void games(Scanner sc) {
        int goalInter = sc.nextInt();
        int goalGremio = sc.nextInt();

        if (goalInter > goalGremio) {
            victoryInter++;
        } else if (goalGremio > goalInter) {
            victoryGremio++;
        } else {
            empates++;
        }
    }
}
