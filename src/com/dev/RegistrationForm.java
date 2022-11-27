package com.dev;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Registration {

    // COLOR CONSOLE TEXT
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void RegistrationAccount(String[] args) {
        Register register = new Register();
        Scanner scanner = new Scanner();

        //REGISTRATION USERNAME
        System.out.println("======ENTER YOUR LOGIN=====");
        String username = scanner.nextLine();
        register.setUsername(username);

        //REGISTRATION LOGIN
        System.out.println("======ENTER YOUR LOGIN=====");
        String login = scanner.nextLine();
        register.setLogin(login);


        System.out.println("======ENTER YOUR PASSWORD=====");
        String password = scanner.nextLine();
        register.setPassword(password);

        //REGISTRATION EMAIL
        System.out.println("======ENTER YOUR EMAIL=====");
        String email = scanner.nextLine();
        register.setEmail(email);

        //REGISTRATION COMPLETE
        System.out.println(ANSI_GREEN + "=====REGISTRATION COMPLETE=====" + ANSI_RESET);
        String regComplete = username + login + password + email;


    }
}
