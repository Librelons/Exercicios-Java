import java.util.Scanner;
import java.util.Locale;

public class ExercicioF05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a foi sua nota na prova?");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.print("Parabéns!!\nVocê foi aprovado!");
        }else {
            System.out.print("Infelizmente você está de recuperação");
        }
    }
}
