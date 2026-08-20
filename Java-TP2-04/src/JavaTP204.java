import java.time.LocalDate;
import java.time.temporal.ChronoUnit; /* já considera ano bissexto */
import java.util.Scanner;

public class JavaTP204 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia = solicitarValor(
                scanner,
                "Digite o dia de nascimento: ");

        int mes = solicitarValor(
                scanner,
                "Digite o mês de nascimento: ");

        int ano = solicitarValor(
                scanner,
                "Digite o ano de nascimento: ");

        LocalDate dataNascimento = criarDataNascimento(dia, mes, ano);

        long idadeEmDias = calcularIdadeEmDias(dataNascimento);

        exibirResultado(dataNascimento, idadeEmDias);

        scanner.close();
    }

    public static int solicitarValor(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static LocalDate criarDataNascimento(
            int dia,
            int mes,
            int ano) {

        return LocalDate.of(ano, mes, dia);
    }

    public static long calcularIdadeEmDias(LocalDate dataNascimento) {

        LocalDate dataAtual = LocalDate.now();

        return ChronoUnit.DAYS.between(
                dataNascimento,
                dataAtual);
    }

    public static void exibirResultado(
            LocalDate dataNascimento,
            long idadeEmDias) {

        System.out.println("\n--- Resultado ---");
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Idade em dias: " + idadeEmDias + " dias");
    }
}