import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double percentualSapos = 0;
        double percentualRatos = 0;
        double percentualCoelhos = 0;
        int casos = 0;
        int ratos = 0;
        int sapos = 0;
        int testes = 0;
        int coelhos = 0;

        testes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testes; i++) {
            String caso = sc.nextLine();
            String[] informacoes = caso.split(" ");
            int qtdCasos = Integer.parseInt(informacoes[0]);

            casos += qtdCasos;

            switch (informacoes[1]) {
                case "C":
                    coelhos += qtdCasos;
                    break;

                case "R":
                    ratos += qtdCasos;
                    break;
            
                case "S":
                    sapos += qtdCasos;
                    break;
                default:
                    break;
            }
        }

        percentualSapos = (double) (sapos * 100) / casos;
        percentualRatos = (double) (ratos * 100) / casos;
        percentualCoelhos = (double) (coelhos * 100) / casos;

        System.out.printf("Total: %d cobaias%n", casos);
        System.out.printf("Total de coelhos: %d%n", coelhos);
        System.out.printf("Total de ratos: %d%n", ratos);
        System.out.printf("Total de sapos: %d%n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);
    }
}
