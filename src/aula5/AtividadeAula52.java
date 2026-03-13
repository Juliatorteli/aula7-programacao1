package aula5;

import java.util.Scanner;

public class AtividadeAula52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(frase);
        sb.reverse();

        System.out.println("Frase lida: " + frase);
        System.out.println("Frase invertida: " + sb);

        sc.close();
    }
}