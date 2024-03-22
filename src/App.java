import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        double total = 0.0;
        int codigo, quantidade = 0;

        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();

        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 2:
                total = 4.50 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 3:
                total = 5.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;

            case 4:
                total = 2.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
                
            case 5:
                total = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
        
            default:
                break;
        }
    }
}
