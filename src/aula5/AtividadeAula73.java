package aula5;

import java.util.Scanner;

public class AtividadeAula73 {

    public static boolean validaCPF(String cpf) {

        if (cpf.length() != 11) {
            return false;
        }

        int soma = 0;

        // Validação do primeiro dígito
        for (int i = 0; i < 9; i++) {
            int num = cpf.charAt(i) - 48;
            soma += num * (10 - i);
        }

        int resto = 11 - (soma % 11);

        if (resto == 10 || resto == 11) {
            resto = 0;
        }

        if (resto != (cpf.charAt(9) - 48)) {
            return false;
        }

        // Validação do segundo dígito
        soma = 0;

        for (int i = 0; i < 10; i++) {
            int num = cpf.charAt(i) - 48;
            soma += num * (11 - i);
        }

        resto = 11 - (soma % 11);

        if (resto == 10 || resto == 11) {
            resto = 0;
        }

        if (resto != (cpf.charAt(10) - 48)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF (somente números): ");
        String cpf = sc.nextLine();

        if (validaCPF(cpf)) {
            System.out.println("CPF Válido");
        } else {
            System.out.println("CPF Inválido");
        }

        sc.close();
    }
}