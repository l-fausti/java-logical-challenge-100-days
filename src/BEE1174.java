/*Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma
das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.*/

import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] <= 10){
                System.out.println("Posição[" + i + "] = " + A[i]);
            }
        }
    }
}
