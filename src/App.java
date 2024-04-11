import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String dayStartString = sc.nextLine();
        String hourStartString = sc.nextLine();

        String dayFinishString = sc.nextLine();
        String hourFinishString = sc.nextLine();

        dayStartString = dayStartString.replaceAll("Dia ", "");
        dayFinishString = dayFinishString.replaceAll("Dia ", "");

        int day = Integer.parseInt(dayStartString);
        int dayFinish = Integer.parseInt(dayFinishString);

        String[] timeStrings = hourStartString.split(" : ");
        int hour = Integer.parseInt(timeStrings[0]);
        int minutes = Integer.parseInt(timeStrings[1]);
        int seconds = Integer.parseInt(timeStrings[2]);

        String[] timeFinishStrings = hourFinishString.split(" : ");
        int hourFinish = Integer.parseInt(timeFinishStrings[0]);
        int minutesFinish = Integer.parseInt(timeFinishStrings[1]);
        int secondsFinish = Integer.parseInt(timeFinishStrings[2]);

        LocalDateTime startDateTime = LocalDateTime.of(2024, 1, day, hour, minutes, seconds);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 1, dayFinish, hourFinish, minutesFinish, secondsFinish);
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
