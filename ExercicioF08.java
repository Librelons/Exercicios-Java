import java.util.Scanner;
import java.util.Locale;

public class ExercicioF08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do seu triângulo:");
        double ladoUm = entrada.nextDouble();
        System.out.println("Digite o segundo lado do seu triângulo:");
        double ladoDois = entrada.nextDouble();
        System.out.println("Digite o terceiro lado do seu triângulo:");
        double ladoTres = entrada.nextDouble();

        if (ladoUm < (ladoDois + ladoTres) && ladoDois < (ladoUm + ladoTres) && ladoTres < (ladoUm + ladoDois)) {
            System.out.println("Seu triângulo existe, parabéns!!");
        } else {
            System.out.println("Seu triângulo é inexistente!");
        }
    }

}
