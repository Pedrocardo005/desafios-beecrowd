import java.util.Scanner;

public class App {

	public static double[] organizar(double[] listagem) {
		for (int i = 0; i < listagem.length; i++) {
			for (int j = i; j < listagem.length; j++) {
				if (listagem[i] < listagem[j]) {
					double buffer = listagem[i];
					listagem[i] = listagem[j];
					listagem[j] = buffer;
				}
			}
		}

		return listagem;
	}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int numA, numB;

		numA = sc.nextInt();
		numB = sc.nextInt();

		if (numB % numA == 0 || numA % numB == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
    }
}
