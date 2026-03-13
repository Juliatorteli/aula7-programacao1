package aula5;

import java.util.Scanner;

public class AtividadeAula51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        // 1 - tamanho da string original
        System.out.println("Tamanho da string original: " + frase.length());

        // 2 - remover espaços do início e do final
        String fraseSemEspacos = frase.trim();
        System.out.println("Tamanho da string sem espaços no início e no final: " + fraseSemEspacos.length());

        // 3 - contar vogais
        int vogais = 0;
        String fraseMinuscula = frase.toLowerCase();

        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char c = fraseMinuscula.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);

        // 4 - contar palavras
        String[] palavras = fraseSemEspacos.split("\\s+");
        System.out.println("Quantidade de palavras: " + palavras.length);

        // 5 - substituir números por *
        String novaFrase = frase.replaceAll("[0-9]", "*");
        System.out.println("Frase com números substituídos: " + novaFrase);

        sc.close();
    }
}