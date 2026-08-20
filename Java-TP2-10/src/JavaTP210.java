import java.util.Random;
import java.util.Scanner;

public class JavaTP210 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = gerarNumeroSecreto();

        int tentativas = jogar(
                scanner,
                numeroSecreto);

        exibirResultado(tentativas);

        scanner.close();
    }


    public static int gerarNumeroSecreto() {

        Random random = new Random();

        return random.nextInt(100) + 1;
    }


    public static int jogar(
            Scanner scanner,
            int numeroSecreto) {

        int tentativas = 0;
        int palpite;

        do {

            palpite = solicitarPalpite(
                    scanner,
                    "Digite um número entre 1 e 100: ");

            tentativas++;

            if (palpite < numeroSecreto) {

                System.out.println(
                        "O número secreto é maior.");

            } else if (palpite > numeroSecreto) {

                System.out.println(
                        "O número secreto é menor.");

            }

        } while (palpite != numeroSecreto);


        return tentativas;
    }


    public static int solicitarPalpite(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextInt();
    }


    public static void exibirResultado(
            int tentativas) {

        System.out.println("\n--- Resultado ---");
        System.out.println(
                "Parabéns! Você acertou.");

        System.out.println(
                "Quantidade de tentativas: "
                        + tentativas);
    }
}