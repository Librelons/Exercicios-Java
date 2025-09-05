import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double numero1, numero2, numero3;

        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        numero3 = entrada.nextDouble();

        double soma = numero1 + numero2 + numero3;
        double media = (soma / 3);

        System.out.printf("A soma será: %s, e sua média aritmética é: %.2f", soma, media);

    }
}
