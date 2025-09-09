import java.util.Scanner;

public class ExercicioF03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int parImpar = entrada.nextInt();

        if (parImpar % 2 == 0){
            System.out.println("Seu numero é um número par");
        }
        else {
            System.out.println("Seu numero é um número impar");
        }
    }
}
