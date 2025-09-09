import java.util.Scanner;

public class ExercicioF10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean loginBemSucedido = false;
        int tentativas = 0; // Contador de tentativas

        while (!loginBemSucedido && tentativas < 3) { // Loop principal de login
            System.out.println("Digite o nome de usuário:");
            String usuario = entrada.nextLine();
            System.out.println("Digite a senha:");
            int senha = entrada.nextInt();
            entrada.nextLine(); // Consumir a quebra de linha
            tentativas++; // Incrementa o contador de tentativas

            if (usuario.equals("admin") && senha == 1234) {
                System.out.println("Bem-vindo, administrador!");
                loginBemSucedido = true;
            } else if (usuario.equals("aluno") && senha == 0000) {
                System.out.println("Bem-vindo, aluno. Você pode consultar suas notas.");
                loginBemSucedido = true;
            } else if (usuario.equals("professor") && senha == 4321) {
                System.out.println("Bem-vindo, professor. Você pode lançar notas.");
                loginBemSucedido = true;
            } else if (usuario.equals("admin") || usuario.equals("aluno") || usuario.equals("professor")) {
                System.out.println("Senha inválida!");
            } else {
                System.out.println("Usuário não encontrado");
            }
        }

        if (!loginBemSucedido && tentativas == 3) {
            System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
        }
    }
}
