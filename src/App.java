import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		double a, b, c;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a + b > c && a + c > b && c + b > a) {
			double perimetro = a + b + c;

			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			double area = ((a + b) * c) / 2;

			System.out.printf("Area = %.1f%n", area);
		}
    }   
}
