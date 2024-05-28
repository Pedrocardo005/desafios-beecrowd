import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        
        for (int x = 0; x < n * 2; x++) {
            if (x % 2 == 0) {
                a++;
                b = a * a;
                c = a * b;
            } else {
                b++;
                c++;
            }
            System.out.printf("%d %d %d%n", a, b, c);
        }
    }
}
