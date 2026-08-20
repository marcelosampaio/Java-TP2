import java.util.Scanner;

public class JavaTP208 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ladoA = solicitarLado(
                scanner,
                "Digite o lado A: ");

        double ladoB = solicitarLado(
                scanner,
                "Digite o lado B: ");

        double ladoC = solicitarLado(
                scanner,
                "Digite o lado C: ");

        String resultado;

        if (verificarTrianguloValido(ladoA, ladoB, ladoC)) {

            resultado = classificarTriangulo(
                    ladoA,
                    ladoB,
                    ladoC);

        } else {

            resultado = "Os valores informados não formam um triângulo válido.";
        }

        exibirResultado(
                ladoA,
                ladoB,
                ladoC,
                resultado);

        scanner.close();
    }


    public static double solicitarLado(
            Scanner scanner,
            String mensagem) {

        System.out.print(mensagem);
        return scanner.nextDouble();
    }


    public static boolean verificarTrianguloValido(
            double ladoA,
            double ladoB,
            double ladoC) {

        return (ladoA + ladoB > ladoC)
                && (ladoA + ladoC > ladoB)
                && (ladoB + ladoC > ladoA);
    }


    public static String classificarTriangulo(
            double ladoA,
            double ladoB,
            double ladoC) {

        if (ladoA == ladoB && ladoB == ladoC) {

            return "Triângulo equilátero.";

        } else if (ladoA == ladoB
                || ladoA == ladoC
                || ladoB == ladoC) {

            return "Triângulo isósceles.";

        } else {

            return "Triângulo escaleno.";
        }
    }


    public static void exibirResultado(
            double ladoA,
            double ladoB,
            double ladoC,
            String resultado) {

        System.out.println("\n--- Triângulo ---");
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Lado C: " + ladoC);
        System.out.println(resultado);
    }
}