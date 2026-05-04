/*
João quer montar um painel de leds contendo diversos números.
Ele não possui muitos leds, e não tem certeza se conseguirá
montar o número desejado.
Considerando a configuração dos leds dos números abaixo,
faça um algoritmo que ajude João a descobrir a quantidade
de leds necessário para montar o valor.

A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente
 ao número de casos de teste, seguido de N linhas, cada linha
 contendo um número (1 ≤ V ≤ 10100) correspondente ao valor
 que João quer montar com os leds.

Para cada caso de teste, imprima uma linha contendo o número de
leds que João precisa para montar o valor desejado, seguido da
palavra "leds".

*/

import java.util.Scanner;

public class BEE1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casesTest = sc.nextInt();

        for (int i = 0; i < casesTest; i++){
            String numeroLED = sc.next();
            int totalLeds = 0;

            for (int j = 0; j < numeroLED.length(); j++){
                char digito = numeroLED.charAt(j);

                switch (digito) {
                    case '1': totalLeds += 2; break;
                    case '2': totalLeds += 5; break;
                    case '3': totalLeds += 5; break;
                    case '4': totalLeds += 4; break;
                    case '5': totalLeds += 5; break;
                    case '6': totalLeds += 6; break;
                    case '7': totalLeds += 3; break;
                    case '8': totalLeds += 7; break;
                    case '9': totalLeds += 6; break;
                    case '0': totalLeds += 6; break;
                }
            }
            System.out.println(totalLeds + " leds");
        }
        sc.close();
    }
}
