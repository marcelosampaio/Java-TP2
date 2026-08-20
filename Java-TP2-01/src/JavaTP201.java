import java.util.Scanner;

public class JavaTP201 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = solicitarNome(scanner, "Digite seu nome completo: ");
        int idade = solicitarIdade(scanner, "Digite sua idade: ");
        String nomeMae = solicitarNome(scanner, "Digite o nome da sua mãe: ");
        String nomePai = solicitarNome(scanner, "Digite o nome do seu pai: ");

        exibirDados(nome, idade, nomeMae, nomePai);

        int comparacaoMae = compararTamanho(nome, nomeMae);
        int comparacaoPai = compararTamanho(nome, nomePai);

        exibirResultado("sua mãe", comparacaoMae);
        exibirResultado("seu pai", comparacaoPai);

        scanner.close();
    }

    public static String solicitarNome(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int solicitarIdade(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        int idade = scanner.nextInt();
        scanner.nextLine();
        return idade;
    }

    public static void exibirDados(String nome, int idade, String nomeMae, String nomePai) {
        System.out.println("\n--- Dados do usuário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);
    }

    public static int compararTamanho(String primeiroNome, String segundoNome) {

        if (primeiroNome.length() > segundoNome.length()) {
            return 1;
        } else if (primeiroNome.length() < segundoNome.length()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void exibirResultado(String pessoa, int resultado) {

        if (resultado > 0) {
            System.out.println("Seu nome possui mais letras que o nome de " + pessoa + ".");
        } else if (resultado < 0) {
            System.out.println("Seu nome possui menos letras que o nome de " + pessoa + ".");
        } else {
            System.out.println("Seu nome possui a mesma quantidade de letras que o nome de " + pessoa + ".");
        }
    }
}