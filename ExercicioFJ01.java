import java.util.Scanner;

public class ExercicioFJ01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de kWh foram consumidos no mês?");
        double kWh = entrada.nextDouble();

        double valor = kWh * 0.9;

        if (kWh <= 100 && valor <= 200 && valor >= 30){
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.5));
        } else if (kWh > 100 && kWh <= 200 && valor <= 200){
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.7));
        } else if (kWh > 200 && kWh < 500 && valor <= 200) {
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (kWh * 0.9));
        } else if (kWh > 200 && kWh <= 500 && valor > 200) {
            System.out.printf("O valor da sua conta de luz será de R$%.2f", (valor - (valor * 0.1)));
        }else if (kWh > 500 && valor > 200) {
            System.out.printf("Consumo elevado: considere economizar energia\nO valor da sua conta de luz será de R$%.2f", (valor - (valor * 0.1)));
        } else if (kWh <= 100 && valor < 30) {
            System.out.println("O valor não será cobrado esse mês, será somado para a próxima conta.");
        } else {
            System.out.println("ERRO");
        }
    }
}
