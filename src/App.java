import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int numA, numB, horas;

		numA = sc.nextInt();
		numB = sc.nextInt();

		if (numA < numB) {
			horas = numB - numA;
		} else {
			horas = 24 - (numA - numB);
		}

		System.out.printf("O JOGO DUROU %d HORA(S)%n", horas);
    }
}
