import java.util.Scanner;
import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double temperaturaum;
        double temperaturadois;
        double temperaturatres;

        System.out.println("Qual foi a temperatura do primeiro dia em Cº? ");
        temperaturaum = entrada.nextDouble();
        System.out.println("Qual foi a temperatura do segundo dis em Cº? ");
        temperaturadois = entrada.nextDouble();
        System.out.println("Qual foi a temperatura do terceiro dis em Cº? ");
        temperaturatres = entrada.nextDouble();

        double media = (temperaturaum + temperaturadois +temperaturatres) / 3;

        System.out.printf("A média das três temperaturas será: %fCº\n", media);

    }
}
