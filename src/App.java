import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int[] lista = {0,0,0,0,0};
		int t;
		int encontrado = 0;

		t = sc.nextInt();
		lista[0] = sc.nextInt();
		lista[1] = sc.nextInt();
		lista[2] = sc.nextInt();
		lista[3] = sc.nextInt();
		lista[4] = sc.nextInt();

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == t) {
				encontrado++;
			}
		}

		System.out.println(encontrado);
    }
}
