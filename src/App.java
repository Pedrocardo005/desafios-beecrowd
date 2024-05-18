import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double primeira, segunda, media, nota;

        primeira = 0.0;
        segunda = 0.0;
        media = 0.0;

        while (true) {
            nota = scan.nextDouble();
            //scan.nextLine();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
                continue;
            }

            if (primeira == 0.0) {
                primeira = nota;
            } else if (segunda == 0.0) {
                segunda = nota;
                media = (double) (primeira + segunda) / 2;
            }

            if (media > 0) {
                System.out.printf("media = %.2f%n", media);
                while (true) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int escolha = scan.nextInt();
                    scan.nextLine();
                    if (escolha == 1) {
                        primeira = 0.0;
                        segunda = 0.0;
                        media = 0.0;
                        break;
                    } else if (escolha < 1 || escolha > 2) {
                        continue;
                    } else if(escolha == 2) {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
