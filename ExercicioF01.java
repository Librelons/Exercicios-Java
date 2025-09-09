import java.util.Scanner;

public class ExercicioF01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = entrada.nextInt();

        if (n < 0){
            System.out.println("Seu número é negativo");
        }
        else {
            System.out.println("Seu número é positivo");
        }


    }
}
