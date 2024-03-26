import java.util.Scanner;

public class App {

    static int busca(int entrada, int divisor) {
		if (entrada % divisor != 0 || entrada % divisor == 0) {
			int valor = 0;
			
			valor = (int) entrada / divisor;
			System.out.printf("%d nota(s) de R$ %d,00%n", valor, divisor);
			entrada = entrada % divisor;
		}
		return entrada;
	}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int entrada = 0;
		entrada = sc.nextInt();
		int[] listagem = {100, 50, 20, 10, 5, 2, 1};
		
        System.out.println(entrada);
		for (int i = 0; i < listagem.length; i++) {
			entrada = busca(entrada, listagem[i]);
		}
 
    }   
}
