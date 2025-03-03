public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName){
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();

        this.age = 20;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
