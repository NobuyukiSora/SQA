package org.example.day11.auth;

public class LoginController {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(){
        String usernameFromDB = "Bebek";
        String passwordFromDB = "123qwe";

        if (this.username.equals(usernameFromDB) && this.password.equals(passwordFromDB)){
            return true;
        } else {
            return false;
        }
    }
}
