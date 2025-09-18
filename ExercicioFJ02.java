import java.util.Scanner;
import java.util.Locale;

public class ExercicioFJ02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual a sua renda mensal?");
        double renda = entrada.nextDouble();
        System.out.println("Qual o valor você pretende pagar mensalmente no financiamento?");
        double financiamento = entrada.nextDouble();

        if (financiamento <= (renda * 0.3) && renda < 10000) {
            System.out.println("Financiamento aprovado");
        }else if (financiamento <= (renda * 0.3) && financiamento > 10000) {
            System.out.println("Financiamento aprovado");
        }else if (financiamento > (renda * 0.3)) {
            System.out.println("Financiamento negado por alta prestação");
        }else if (financiamento <= (renda * 0.3) && financiamento > 3000 && renda >= 10000) {
            System.out.println("Financiamento aprovado");
        }else {
            System.out.println("ERRO");
        }
    }
}