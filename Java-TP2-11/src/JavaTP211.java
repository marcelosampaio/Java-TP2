import java.util.Scanner;

public class JavaTP211 {

    private static final int LIMITE = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorInicial = solicitarValor(
                scanner,
                "Digite o valor inicial: ");

        int incremento = solicitarValor(
                scanner,
                "Digite o incremento: ");

        exibirSequencia(valorInicial, incremento);

        scanner.close();
    }

    public static int solicitarValor(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static void exibirSequencia(
            int valorInicial,
            int incremento) {

        int valorAtual = valorInicial;

        System.out.print("\n--- Sequência ---\n");

        while (valorAtual <= LIMITE) {

            System.out.print(valorAtual);

            valorAtual += incremento;

            if (valorAtual <= LIMITE) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}