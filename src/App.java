import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtdValores, dentroIntervalo, foraIntervalo;

        qtdValores = dentroIntervalo = foraIntervalo = 0;

        qtdValores = sc.nextInt();

        for (int i = 0; i < qtdValores; i++) {
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println(dentroIntervalo + " in");
        System.out.println(foraIntervalo + " out");
    }
}
