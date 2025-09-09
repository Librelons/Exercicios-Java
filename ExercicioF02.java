import java.util.Scanner;

public class ExercicioF02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de Idade!\nJá pode ser preso!!");
        }else {
            System.out.printf("Você é menor de idade!\nCuidado com o que você faz!");
        }
    }
}
