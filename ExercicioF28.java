import java.util.Scanner;

public class ExercicioF28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a idade da pessoa?");
        int idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("NÃO É ELEITOR");
        } else if (idade >= 16 && idade < 18){
            System.out.println("ELEITOR FACULTATIVO");
        } else if (idade >= 18 && idade <= 65){
            System.out.println("ELEITOR OBRIGATÓRIO");
        } else {
            System.out.println("ELEITOR FACULTATIVO");
        }
    }
}