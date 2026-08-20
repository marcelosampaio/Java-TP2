import java.util.Scanner;

public class JavaTP207 {

    private static final double LIMITE_ISENCAO = 20000;
    private static final double LIMITE_SEGUNDA_FAIXA = 50000;
    private static final double ALIQUOTA_SEGUNDA_FAIXA = 0.10;
    private static final double ALIQUOTA_TERCEIRA_FAIXA = 0.20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBruto = solicitarSalario(
                scanner,
                "Digite o salário bruto anual: ");

        double imposto = calcularImposto(salarioBruto);

        double salarioLiquido = calcularSalarioLiquido(
                salarioBruto,
                imposto);

        exibirResultado(
                salarioBruto,
                imposto,
                salarioLiquido);

        scanner.close();
    }

    public static double solicitarSalario(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double calcularImposto(double salarioBruto) {

        double imposto = 0;

        if (salarioBruto <= LIMITE_ISENCAO) {

            imposto = 0;

        } else if (salarioBruto <= LIMITE_SEGUNDA_FAIXA) {

            double valorTributavel =
                    salarioBruto - LIMITE_ISENCAO;

            imposto = valorTributavel * ALIQUOTA_SEGUNDA_FAIXA;

        } else {

            double segundaFaixa =
                    LIMITE_SEGUNDA_FAIXA - LIMITE_ISENCAO;

            double terceiraFaixa =
                    salarioBruto - LIMITE_SEGUNDA_FAIXA;

            imposto = (segundaFaixa * ALIQUOTA_SEGUNDA_FAIXA)
                    + (terceiraFaixa * ALIQUOTA_TERCEIRA_FAIXA);
        }

        return imposto;
    }

    public static double calcularSalarioLiquido(
            double salarioBruto,
            double imposto) {

        return salarioBruto - imposto;
    }

    public static void exibirResultado(
            double salarioBruto,
            double imposto,
            double salarioLiquido) {

        System.out.println("\n--- Imposto de Renda ---");
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Imposto a pagar: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}