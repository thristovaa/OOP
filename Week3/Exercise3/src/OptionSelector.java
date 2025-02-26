import java.util.ArrayList;

public class OptionSelector {
//    // Select one person to do a job!
//    ArrayList<Person> persons = new ArrayList<>();
//        persons.add(tristan);
//        persons.add(marko);
//        persons.add(thi);
//
//        System.out.println("****** Please select a person to do this chore ******");
//        for(int i = 0; i < persons.size(); i++){
//        Person currentPerson = persons.get(i);
//        System.out.printf("%d) %s%n", i, currentPerson);
//    }
//    boolean isValid = false;
//    int number = -1;
//
//        while(!isValid) {
//        System.out.print("Please enter a number: ");
//        String numberInText = sc.nextLine();
//
//        try {
//            number = Integer.parseInt(numberInText);
//        } catch (NumberFormatException e) {
//            System.out.println("Please enter a valid number.");
//        }
//
//        if(number < 0 || number > persons.size()) {
//            System.out.printf("Please enter a value between 0 and %d.%n", persons.size());
//        } else {
//            isValid = true;
//        }
//    }

    public void addOption(Person option) {

    }

    public Person promptMenu() {
        return new Person("dummy");
    }
}