import java.util.Scanner;

public class JavaTP205 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorCompra = solicitarValorCompra(
                scanner,
                "Digite o valor da compra: ");

        double desconto = calcularDesconto(valorCompra);

        double valorFinal = calcularValorFinal(
                valorCompra,
                desconto);

        exibirResultado(
                valorCompra,
                desconto,
                valorFinal);

        scanner.close();
    }

    public static double solicitarValorCompra(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double calcularDesconto(double valorCompra) {

        if (valorCompra > 1000) {
            return valorCompra * 0.10;

        } else if (valorCompra >= 500) {
            return valorCompra * 0.05;

        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(
            double valorCompra,
            double desconto) {

        return valorCompra - desconto;
    }

    public static void exibirResultado(
            double valorCompra,
            double desconto,
            double valorFinal) {

        System.out.println("\n--- Compra ---");
        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}