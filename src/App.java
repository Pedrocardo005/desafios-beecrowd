import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int alcool, gasolina, diesel;

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        
        while(true) {
            int valor = scan.nextInt();

            if (valor == 1) {
                alcool++;
            } else if (valor == 2) {
                gasolina++;
            } else if (valor == 3) {
                diesel++;
            } else if (valor == 4) {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
