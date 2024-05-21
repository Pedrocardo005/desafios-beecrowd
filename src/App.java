import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int inter, gremio, empates, grenais = 0;

        inter = 0;
        gremio = 0;
        empates = 0;

        while (true) {
            int novoGrenal, golsInter, golsGremio = 0;
            String resultado = scan.nextLine();
            String[] resultadoArray = resultado.split(" ");

            golsInter = Integer.parseInt(resultadoArray[0]);
            golsGremio = Integer.parseInt(resultadoArray[1]);

            if (golsInter > golsGremio) {
                inter++;
            } else if (golsGremio > golsInter) {
                gremio++;
            } else {
                empates++;
            }

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = scan.nextInt();
            scan.nextLine();
            if (novoGrenal == 1) {
                continue;
            } else {
                break;
            }
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
