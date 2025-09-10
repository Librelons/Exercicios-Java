import java.util.Scanner;

public class ExercicioF07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade <= 12){
            System.out.println("O nadador está na categoria Infantil");
        }else if (idade >= 13 && idade <= 17){
            System.out.println("O nadador está na categoria Juvenil");
        }else {
            System.out.println("O nadador está na categoria Adulta");
        }
    }
}
