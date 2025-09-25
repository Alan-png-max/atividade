import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Digite as 8 notas anuais do aluno:");

        // Recebe as 8 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Calcula médias semestrais
        double[] mediasSemestrais = new double[2];
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Calcula média final
        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Exibe os resultados
        System.out.println("\n📊 Resultados:");
        for (int i = 0; i < mediasBimestrais.length; i++) {
            System.out.printf("Média do %dº bimestre: %.2f%n", i + 1, mediasBimestrais[i]);
        }
        System.out.printf("Média do 1º semestre: %.2f%n", mediasSemestrais[0]);
        System.out.printf("Média do 2º semestre: %.2f%n", mediasSemestrais[1]);
        System.out.printf("Média final: %.2f%n", mediaFinal);

        scanner.close();
    }
}

