import java.util.Scanner;

public class JavaTP212 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String frase = solicitarFrase(
                scanner,
                "Digite uma frase: ");

        String[] palavras = separarPalavras(frase);

        int quantidadePalavras = contarPalavras(palavras);

        exibirResultado(quantidadePalavras);

        scanner.close();
    }

    public static String solicitarFrase(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static String[] separarPalavras(String frase) {

        return frase.trim().split("\\s+");
    }

    public static int contarPalavras(String[] palavras) {

        int contador = 0;

        for (String palavra : palavras) {
            contador++;
        }

        return contador;
    }

    public static void exibirResultado(
            int quantidadePalavras) {

        System.out.println("\n--- Resultado ---");
        System.out.println(
                "Quantidade de palavras: "
                        + quantidadePalavras);
    }
}