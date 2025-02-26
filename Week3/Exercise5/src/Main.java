import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //now
        LocalDateTime now = LocalDateTime.now();

        LocalDate birthday = LocalDate.of(2025, 12, 22);
        LocalDate today = LocalDate.now();

        //birthday
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today)){
            nextBirthday = nextBirthday.plusYears(1);
        }

        //waiting time
        LocalDateTime momentOfMyBirthday = LocalDateTime.of(birthday, LocalTime.of(0,0));

        Duration waitingTime = Duration.between(now, momentOfMyBirthday);

        //been alive for
        LocalDate bornOn = LocalDate.of(2005, 12, 22);

        Period daysAlive = Period.between(bornOn, today);

        //output
        System.out.println(now);
        System.out.println(getProperDate(now));
        System.out.println("Your next birthday will be at " + nextBirthday);
        System.out.printf("Your next birthday is in: %d days, %d hours, %d minutes and %d seconds%n",
                waitingTime.toDays(),
                waitingTime.toHoursPart(),
                waitingTime.toMinutesPart(),
                waitingTime.toSecondsPart()
        );
        System.out.println("You have been alive for " + daysAlive.getDays() + " days.");
    }

    public static String getProperDate(LocalDateTime now){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return dtf.format(now);
    }


}