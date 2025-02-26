import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Company comp = new Company("Saxion");
        comp.registerWork(1,
                "Teaching",
                LocalDateTime.now().withHour(15).withMinute(45),
                LocalDateTime.of(2025, 2, 26, 18, 0));

        Scanner fileReader = new Scanner(new File("work.csv"));

        fileReader.nextLine();

        while(fileReader.hasNext()){
            String lineInFile = fileReader.nextLine();

            String[] lineParts = lineInFile.split(";");


        }
    }
}