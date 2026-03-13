package aula6;

import java.util.Scanner;

public class VerificadorSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        if (senhaValida(senha)) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }

        scanner.close();
    }

    private static boolean senhaValida(String senha) {

        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }

            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        return temMaiuscula && temMinuscula && temNumero;
    }
}