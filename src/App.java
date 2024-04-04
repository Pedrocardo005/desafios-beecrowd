import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double salario = 0.0;

        salario = sc.nextDouble();

        if (salario >= 0 && salario <= 400.00) {
            double novoSalario, reajuste = salario * 0.15;
            
            novoSalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario >= 400.01 && salario <= 800.00) {
            double novoSalario, reajuste = salario * 0.12;
            
            novoSalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            double novoSalario, reajuste = salario * 0.10;
            
            novoSalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            double novoSalario, reajuste = salario * 0.07;
            
            novoSalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 7 %");
        } else if (salario > 2000.00) {
            double novoSalario, reajuste = salario * 0.04;
            
            novoSalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}
