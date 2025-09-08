import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite sua peso: ");
        double peso = entrada.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("Seu IMC será: %.2f", imc);
    }
}
