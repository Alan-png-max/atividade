import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\n🌡️ Resultados da Conversão:");
        System.out.printf("Temperatura original: %.2f °C%n", celsius);
        System.out.printf("Convertida para Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Convertida para Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
