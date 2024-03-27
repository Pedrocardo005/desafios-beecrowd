import java.util.Scanner;

public class App {

	public static void ordenar(int[] lista) {

		for (int x = 0; x < lista.length; x++) {
			for (int i = x + 1; i < lista.length; i++) {
				if(lista[x] > lista[i]) {
					int buffer = lista[x];
					lista[x] = lista[i];
					lista[i] = buffer;
				}
			}
		}

		for (int y = 0; y < lista.length; y++) {
			System.out.println(lista[y]);
		}
	}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		int[] arrayFromNumbers = {0,0,0};

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		arrayFromNumbers[0] = num1;
		arrayFromNumbers[1] = num2;
		arrayFromNumbers[2] = num3;

		ordenar(arrayFromNumbers.clone());

		System.out.println("");

		for (int x = 0; x < arrayFromNumbers.length; x++) {
			System.out.println(arrayFromNumbers[x]);
		}
    }   
}
