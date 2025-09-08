import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite sua peso: ");
        double peso = entrada.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.printf ("Você está abaixo do peso com o IMC de %.2f.", imc);
        } else if ( imc >= 18.5 && imc < 25) {
            System.out.printf ("Seu peso está ok, com o IMC de %.2f.", imc);
        } else if ( imc >= 25 && imc < 30) {
            System.out.printf ("Você está com sobrepeso, com IMC de %.2f.", imc);
        } else {
            System.out.printf ("Você está obeso, com IMC de %.2f.", imc);
        }

    }
}
