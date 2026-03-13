package aula3;

import java.util.Scanner;

public class AtividadeAula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        double[] C = new double[10];

        // 1) Ler os vetores A e B
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = sc.nextInt();

            System.out.print("Digite B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        // 2) Calcular vetor C
        for (int i = 0; i < 10; i++) {
            if (B[i] != 0) {
                C[i] = (double) A[i] / B[i];
            } else {
                C[i] = 0; // evita divisão por zero
            }
        }

        // 3) Imprimir C de forma invertida
        System.out.println("\nVetor C (invertido):");
        for (int i = 9; i >= 0; i--) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        // 4) Imprimir números pares do vetor A
        System.out.println("\nNúmeros pares do vetor A:");
        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                System.out.println(A[i]);
            }
        }

        sc.close();
    }
}
            	
            