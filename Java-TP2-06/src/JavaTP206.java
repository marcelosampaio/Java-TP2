import java.util.Scanner;

public class JavaTP206 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ano = solicitarAno(
                scanner,
                "Digite um ano: ");

        boolean anoBissexto = verificarAnoBissexto(ano);

        exibirResultado(ano, anoBissexto);

        scanner.close();
    }

    public static int solicitarAno(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static boolean verificarAnoBissexto(int ano) {

        return (ano % 400 == 0)
                || (ano % 4 == 0 && ano % 100 != 0);
    }

    public static void exibirResultado(
            int ano,
            boolean anoBissexto) {

        System.out.println("\n--- Resultado ---");

        if (anoBissexto) {
            System.out.println(
                    "O ano " + ano + " é bissexto.");
        } else {
            System.out.println(
                    "O ano " + ano + " não é bissexto.");
        }
    }
}