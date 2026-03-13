package aula2;
public class AtividadeServidores {

    public static void main(String[] args) {

        double servidorA = 120.0;
        double servidorB = 500.0;

        double taxaA = 0.015;  // 1,5%
        double taxaB = 0.006;  // 0,6%

        int mes = 0;

        System.out.println("RELATÓRIO DE CRESCIMENTO DE USO DE ARMAZENAMENTO");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s%n", "Mês", "Servidor A (GB)", "Servidor B (GB)");
        System.out.println("-------------------------------------------------------");

        while (servidorA <= servidorB) {

            System.out.printf("%-5d %-15.2f %-15.2f%n", mes, servidorA, servidorB);

            servidorA += servidorA * taxaA;
            servidorB += servidorB * taxaB;

            mes++;
        }

        // imprime o último mês (quando ultrapassou)
        System.out.printf("%-5d %-15.2f %-15.2f%n", mes, servidorA, servidorB);

        System.out.println();
        System.out.println("O Servidor A ultrapassou o Servidor B após " + mes + " meses.");
    }
}