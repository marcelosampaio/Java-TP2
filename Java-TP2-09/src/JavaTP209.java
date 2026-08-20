import java.util.Scanner;

public class JavaTP209 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senhaCadastrada = solicitarSenha(
                scanner,
                "Cadastre uma senha: ");

        validarSenha(
                scanner,
                senhaCadastrada);

        exibirResultado();

        scanner.close();
    }


    public static String solicitarSenha(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextLine();
    }


    public static void validarSenha(
            Scanner scanner,
            String senhaCadastrada) {

        String senhaDigitada;

        do {

            senhaDigitada = solicitarSenha(
                    scanner,
                    "Digite novamente a senha: ");

        } while (!senhaDigitada.equals(senhaCadastrada));
    }


    public static void exibirResultado() {

        System.out.println(
                "\nSenha validada com sucesso!");
    }
}