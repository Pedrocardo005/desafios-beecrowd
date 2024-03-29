import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int numA, numB;

		numA = sc.nextInt();
		numB = sc.nextInt();

		if (numB % numA == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
    }
}
