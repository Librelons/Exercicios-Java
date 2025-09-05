import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double numeroum;
        double numerodois;

        System.out.println("Digite um numero: ");
        numeroum = entrada.nextDouble();
        System.out.println("Digite outro numero: ");
        numerodois = entrada.nextDouble();

        double soma = numeroum + numerodois;
        double subtracao = numeroum - numerodois;
        double multiplicacao = numeroum * numerodois;
        double divisao = numeroum / numerodois;

        System.out.printf("A soma será: %.2f\nA subtração será: %.2f\nA multiplicação será: %.2f\nA divisão será: %.2f", soma, subtracao, multiplicacao, divisao);

    }
}
