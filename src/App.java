import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int multiplicacao = i * n;
            System.out.printf("%d x %d = %d%n", i, n, multiplicacao);
        }
    }
}
