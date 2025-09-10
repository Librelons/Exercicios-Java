import java.util.Scanner;

public class ExercicioF09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3 ){
            System.out.println("O primeiro número é maior!");
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O segundo número é maior!");
        } else {
            System.out.println("O terceiro número é maior!");
        }
    }
}
