import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        
        Double num1, num2, num3, num4, media;

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        num4 = scanner.nextDouble();

        num1 *= 0.2;
        num2 *= 0.3;
        num3 *= 0.4;
        num4 *= 0.1;

        media = num1 + num2 + num3 + num4;

        String mediaFormated = media.toString();

        mediaFormated = mediaFormated.substring(0, 3);

        System.out.println("Media: " + mediaFormated);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            double notaExame = 0.0;

            System.out.println("Aluno em exame.");

            notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            media = (media + notaExame) / 2;

            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
