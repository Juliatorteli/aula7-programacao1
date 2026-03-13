package aula3;

import java.util.Scanner;

public class Atividade47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][3];
        int[] somaLinhas = new int[4];
        int[] somaColunas = new int[3];

        // 1) Preencher matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // 2) Calcular soma das linhas e colunas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        // 3) Mostrar relatório
        System.out.println("\nRELATÓRIO:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("= " + somaLinhas[i]);
        }

        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }

        sc.close();
    }
}