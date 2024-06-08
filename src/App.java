import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int somatorio = 0;
        int qtd = 0;
        
        while (n > 0) {
            somatorio += n;
            qtd++;
            n = scan.nextInt();
        }

        double media = (double) somatorio / qtd;
        System.out.printf("%.2f%n", media);
    }
}
