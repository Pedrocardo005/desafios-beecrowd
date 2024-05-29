import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int x, y, a, b, c;
        String linha;
        String[] linhas;
        
        linha = scan.nextLine();
        linhas = linha.split(" ");
        a = 1;
        b = 2;
        c = 3;
        
        x = Integer.parseInt(linhas[0]);
        y = Integer.parseInt(linhas[1]);
        
        while(a <= y && b <= y && c <= y) {
            System.out.printf("%d %d %d%n", a, b, c);
            
            a += x;
            b += x;
            c += x;
        }
    }
}
