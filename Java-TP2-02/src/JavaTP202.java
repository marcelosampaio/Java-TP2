import java.util.Scanner;

public class JavaTP202 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1 = solicitarNota(scanner,  "Digite a nota do 1º bimestre: ");
        double nota2 = solicitarNota(scanner,  "Digite a nota do 2º bimestre: ");
        double nota3 = solicitarNota(scanner,  "Digite a nota do 3º bimestre: ");
        double nota4 = solicitarNota(scanner,  "Digite a nota do 4º bimestre: ");

        double media = calcularMedia(nota1, nota2, nota3, nota4);

        String resultado = determinarResultado(media);

        exibirResultado(nota1, nota2, nota3, nota4, media, resultado);

        scanner.close();
    }

    public static double solicitarNota(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static String determinarResultado(double media) {

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Em recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirResultado(
            double nota1,
            double nota2,
            double nota3,
            double nota4,
            double media,
            String resultado) {

        System.out.println("\n--- Resultado ---");
        System.out.println("Nota do 1º bimestre: " + nota1);
        System.out.println("Nota do 2º bimestre: " + nota2);
        System.out.println("Nota do 3º bimestre: " + nota3);
        System.out.println("Nota do 4º bimestre: " + nota4);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + resultado);
    }
}