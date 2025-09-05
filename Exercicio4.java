import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double preco;

        System.out.println("Digite o preço do item: ");
        preco = entrada.nextDouble();

        double desconto = preco - (preco * 0.1);

        System.out.printf("Seu produto com desconto será: R$%.2f", desconto);
    }
}
