package nl.saxion.oop.week2;

import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate birthDate;

    public Author(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }
}
