import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        Library library = new Library();

        //add books
        try {
            Scanner bookReader = new Scanner(new File("books.csv"));
            bookReader.nextLine();

            while (bookReader.hasNext()){
                String line = bookReader.nextLine();

                String[] lineParts = line.split(";");

                long id = Long.parseLong(lineParts[0]);
                String title = lineParts[1];
                String author = lineParts[2];
                long isbn = Long.parseLong(lineParts[3]);

                Book b = new Book(id, title, author, isbn);
                library.addBooks(b);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Cannot find books CSV: " + fnfe);
        }

        //add dvds
        try {
            Scanner dvdReader = new Scanner(new File("dvds.csv"));
            dvdReader.nextLine();

            while (dvdReader.hasNext()) {
                String line = dvdReader.nextLine();

                String[] lineParts = line.split(";");

                long id = Long.parseLong(lineParts[0]);
                String title = lineParts[1];
                String rating = lineParts[6];
                int yearOfRelease = Integer.parseInt(lineParts[7]);

                Dvd d = new Dvd(id, title, rating, yearOfRelease);
                library.addDvds(d);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Cannot find dvd CSV: " + fnfe);
        }

        library.allInOne();

        System.out.println("Read " + library.getBooks().size() + " books and " + library.getDvds().size() + " dvds!");
        String function;

        //functions
        outer:
        while (true){
            System.out.print("[C]ollection, [L]end list, lend [O]ut, take back [I]n or e[X]it: ");
            function = consoleScanner.nextLine().toLowerCase();

            switch (function) {
                case "c":
                    library.displayAll();
                    break;

                case "l":
                    library.lendDisplay();
                    break;

                case "o":
                    library.lendOut();
                    break;

                case "i":
                    library.lendIn();
                    break;

                case "x":
                    break outer;

                default:
                    System.out.println("Not a valid option!");
                    break;
            }

            System.out.println(" === END OF LIST ===");
            System.out.println();
        }
    }
}