package iniciais;
import java.util.Scanner;

/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
    Entrada
    O arquivo de entrada contém 100 números inteiros, positivos e distintos.
    Saída
    Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.*/

public class BEE1080 {
    public static void main(String[] args) {
        int numeros[] = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        var maiorValor = numeros[0];
        int posicao = 1;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
                posicao = i + 1;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
