package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class UserAccount {
    public String username;
    public String password;

    UserAccount(String password){
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
