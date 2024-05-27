import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int entrada, a, b, c;
        entrada = scan.nextInt();
        a = 1;
        b = 1;
        c = 1;
        
        for (int i = 0; i < entrada; i++) {
            System.out.printf("%d %d %d%n", a, b, c);
            a++;
            b = a * a;
            c = a * b;
        }
    }
}
