package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;


//in class practice
public class Person {
    public String name;
    public int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else SaxionApp.printLine("NO");
    }
    */

    public void haveBirthday() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
