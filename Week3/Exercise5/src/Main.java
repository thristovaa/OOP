import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //now
        LocalDateTime now = LocalDateTime.now();

        LocalDate birthday = LocalDate.of(2005, 12, 22);
        LocalDate today = LocalDate.now();

        //birthday
        LocalDate nextBirthday = birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today)){
            nextBirthday = nextBirthday.plusYears(1);
        }

        System.out.println(now);
        System.out.println(getProperDate(now));
        System.out.println("Your next birthday will be at " + nextBirthday);
    }

    public static String getProperDate(LocalDateTime now){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return dtf.format(now);
    }


}