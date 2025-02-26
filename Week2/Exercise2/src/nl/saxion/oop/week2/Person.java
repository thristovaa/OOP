package nl.saxion.oop.week2;

public class Person {
    private String firstname;
    private String lastname;
    private String zipCode;
    private String phoneNumber;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too high.");
        }

        this.age = age;
    }

    public void setZipCode(String zipCode) {
        char[] zip = zipCode.toCharArray();

        if (zipCode.length() < 6) {
            throw new IllegalArgumentException("Zip code is too short!");
        }

        int letters = 0;
        int digits = 0;

        for (char c : zip){
            if(Character.isLetter(c)){
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            }
        }

        if (digits != 4){
            throw new IllegalArgumentException("Not the right amount of digits!");
        } else if (letters != 2){
            throw new IllegalArgumentException("Not the right amount of letters!");
        }

        this.zipCode = zipCode;
    }

    public void setPhonenumber(String phoneNumber) {
        if (!phoneNumber.startsWith("0")){
            throw new IllegalArgumentException("Phone number should start with a 0");
        } else if (phoneNumber.length() > 10){
            throw new IllegalArgumentException("Phone number is too long");
        } else if(phoneNumber.length() < 10){
            throw new IllegalArgumentException("Phone number is too short");
        }

        this.phoneNumber = phoneNumber;
    }

    /**
     * This is the default generated toString from IntelliJ. It works for now!
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}