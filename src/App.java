import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double primeira, segunda, media;

        primeira = 0;
        segunda = 0;
        
        while (true) {
            double numero;

            numero = scan.nextDouble();
            scan.nextLine();

            if (numero < 0 || numero > 10) {
                System.out.println("nota invalida");
                continue;
            }

            if (primeira == 0) {
                primeira = numero;
            } else {
                segunda = numero;
                break;
            }
        }

        media = (double) (primeira + segunda) / 2;

        System.out.printf("media = %.2f%n", media);
    }
}
