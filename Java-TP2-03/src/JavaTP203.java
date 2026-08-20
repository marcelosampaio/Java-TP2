import java.util.Scanner;

public class JavaTP203 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorReais = solicitarValor(
                scanner,
                "Digite o valor em reais: ");

        String moedaDestino = solicitarMoeda(
                scanner,
                "Digite a moeda de destino (dolar, euro ou libra): ");

        double valorConvertido = converterMoeda(valorReais, moedaDestino);

        exibirResultado(valorReais, moedaDestino, valorConvertido);

        scanner.close();
    }

    public static double solicitarValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    public static String solicitarMoeda(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static double converterMoeda(
            double valorReais,
            String moedaDestino) {

        double taxa;

        if (moedaDestino.equalsIgnoreCase("dolar")) {
            taxa = 5.50;
        } else if (moedaDestino.equalsIgnoreCase("euro")) {
            taxa = 6.40;
        } else if (moedaDestino.equalsIgnoreCase("libra")) {
            taxa = 7.40;
        } else {
            taxa = 0;
        }

        if (taxa > 0) {
            return valorReais / taxa;
        }

        return -1;
    }

    public static void exibirResultado(
            double valorReais,
            String moedaDestino,
            double valorConvertido) {

        System.out.println("\n--- Conversão ---");
        System.out.println("Valor em reais: R$ " + valorReais);
        System.out.println("Moeda de destino: " + moedaDestino);

        if (valorConvertido >= 0) {
            System.out.printf(
                    "Valor convertido: %.2f%n",
                    valorConvertido);
        } else {
            System.out.println("Moeda de destino inválida.");
        }
    }
}