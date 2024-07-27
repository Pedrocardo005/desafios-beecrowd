import java.util.Scanner;

public class App {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            int resposta = fibonacci(valor);

            System.out.printf("Fib(%d) = %d", valor, resposta);
        }
    }
}
