import java.util.Scanner;

public class ExercicioF06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de uma compra: ");
        int valorCompra = entrada.nextInt();

        if (valorCompra >= 100){
            double valorDesconto = valorCompra * 0.1;
            double resultado = valorCompra - valorDesconto;
            System.out.printf("O valor resultante foi %.2f%n" , resultado);
        }
        else {
            System.out.println("O valor resultante foi: " + valorCompra);
        }
    }
}
