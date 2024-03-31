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
		double[] listagem = {0.0, 0.0, 0.0};

		listagem[0] = sc.nextDouble();
		listagem[1] = sc.nextDouble();
		listagem[2] = sc.nextDouble();
		
		listagem = organizar(listagem);

		if (listagem[0] >= (listagem[1] + listagem[2])) {
			System.out.println("NAO FORMA TRIANGULO");
			System.exit(0);
		}

		if ((listagem[0] * listagem[0]) == ((listagem[1] * listagem[1]) + (listagem[2] * listagem[2]))) {
			System.out.println("TRIANGULO RETANGULO");
		}

		if ((listagem[0] * listagem[0]) > ((listagem[1] * listagem[1]) + (listagem[2] * listagem[2]))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}

		if ((listagem[0] * listagem[0]) < ((listagem[1] * listagem[1]) + (listagem[2] * listagem[2]))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (listagem[0] == listagem[1] && listagem[1] == listagem[2]) {
			System.out.println("TRIANGULO EQUILATERO");
			System.exit(0);
		}

		if (listagem[0] == listagem[1] || listagem[1] == listagem[2] || listagem[0] == listagem[2]) {
			System.out.println("TRIANGULO ISOSCELES");
		}
    }
}
