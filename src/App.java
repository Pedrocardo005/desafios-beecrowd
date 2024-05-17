import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] values = line.split(" ");
            int first, second;
            Double result;

            first = Integer.parseInt(values[0]);
            second = Integer.parseInt(values[1]);

            try {
                result = (double) first / second;
                if (result.isInfinite()) {
                    System.out.println("divisao impossivel");
                } else {
                    System.out.printf("%.1f%n", result);
                }
            } catch (Exception e) {
                System.out.println("divisao impossivel");
            }
        }
    }
}
