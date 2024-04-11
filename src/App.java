import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, 5, 8, 12, 23);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 1, 9, 6, 13, 23);
        Long valor = ChronoUnit.SECONDS.between(startDateTime, endDateTime);

        Long dias = valor / 86400;
        Long horas = valor % 86400;
        Long minutos = horas % 3600;
        horas = horas / 3600;
        Long segundos = minutos % 60;
        minutos = minutos / 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
