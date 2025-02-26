package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        // First test if everything works well with valid data:
        Person goodPerson = new Person("Evert", "Duipmans");
        goodPerson.setAge(33);
        goodPerson.setZipCode("8888AA");
        goodPerson.setPhonenumber("0612345678");
        SaxionApp.printLine(goodPerson);

        // Now test with invalid data:

        // Test 1: check invalid age
        try {
            Person p = new Person("Tristan", "Pothoven");
            p.setAge(-1);
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 2: check invalid zipcode (too short)
        try {
            goodPerson.setZipCode("7413S");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 3: check invalid zipcode (not numeric)
        try {
            goodPerson.setZipCode("741AAS");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 4: check invalid zipcode (no letters)
        try {
            goodPerson.setZipCode("7413ASS");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 5: check phone number (too long)
        try {
            goodPerson.setPhonenumber("039219394688");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 6: check phone number (not starting with a 0)
        try {
            goodPerson.setPhonenumber("39219394688");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 7: check phone number (too short)
        try {
            goodPerson.setPhonenumber("0394688");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

    }
}