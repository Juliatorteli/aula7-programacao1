package aula3;

public class Atividade43 {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        int soma = 0;
        int somaPares = 0;
        int qtdPares = 0;

        int menor;
        int maior;

        // 1) Gerar números aleatórios
        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 100); // 0 a 99
        }

        // Inicializa menor e maior
        menor = vetor[0];
        maior = vetor[0];

        // 2) Processar os valores
        for (int i = 0; i < 10; i++) {

            System.out.println("Número: " + vetor[i]);

            soma += vetor[i];

            // verificar par
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                qtdPares++;
            }

            // verificar menor
            if (vetor[i] < menor) {
                menor = vetor[i];
            }

            // verificar maior
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // calcular média dos pares
        double mediaPares = 0;
        if (qtdPares > 0) {
            mediaPares = (double) somaPares / qtdPares;
        }

        // 3) Imprimir resultados
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}