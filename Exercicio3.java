import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o idade em anos: ");
        int idade = entrada.nextInt();

        int idademeses = idade * 12;

        System.out.printf("Sua idade em meses será: %d", idademeses);
    }
}
