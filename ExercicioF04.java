import java.util.Scanner;

public class ExercicioF04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num2 = entrada.nextInt();;

        if (num1 > num2){
            System.out.println("O primeiro número é maior!");
        }
        else if (num2 > num1){
            System.out.println("O segundo número é maior!");
        }
        else {
            System.out.println("Os dois números são iguais!");
        }
    }
}
