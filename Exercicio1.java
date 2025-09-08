import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();

        // Variavel utilizada apenas para calcular o dobro do numero recebido no inicio
        double dobro = numero * 2;

        System.out.printf("O seu número é %s, e seu dobro será %s\n", numero, dobro);

    }
}
