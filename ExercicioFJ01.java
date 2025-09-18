import java.util.Scanner;

public class ExercicioFJ01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de kWh foram consumidos no mês?");
        double kWh = entrada.nextDouble();

        if (kWh <= 100){
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.5));
        } else if (kWh > 100 && kWh <= 200){
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.7));
        } else {
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.9));
        }
    }
}