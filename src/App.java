import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int horaInicial, minutoInicial, horaFinal, minutoFinal, 
			horaMinutoInicial, horaMinutoFinal, diferenca,
			minutosSobra, horas;

		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();

		if (horaFinal < horaInicial && minutoFinal < minutoInicial) {
			horaFinal += 24;
		}

		horaMinutoInicial = (horaInicial * 60) + minutoInicial;
		horaMinutoFinal = (horaFinal * 60) + minutoFinal;

		diferenca = horaMinutoFinal - horaMinutoInicial;
		minutosSobra = diferenca % 60;
		horas = diferenca / 60;

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutosSobra);
    }
}
