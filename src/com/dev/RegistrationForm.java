package com.dev;

import java.util.Scanner;

public class RegistrationForm {

    // COLOR CONSOLE TEXT
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void RegistrationAccount() {
        Register register = new Register();
        Scanner scanner = new Scanner(System.in);

        //REGISTRATION USERNAME
        System.out.println("======REGISTER YOUR USERNAME=====");
        String username = scanner.nextLine();
        register.setUsername(username);

        //REGISTRATION LOGIN
        System.out.println("======REGISTER YOUR LOGIN=====");
        String login = scanner.nextLine();
        register.setLogin(login);


        System.out.println("======REGISTER YOUR PASSWORD=====");
        String password = scanner.nextLine();
        register.setPassword(password);

        //REGISTRATION EMAIL
        System.out.println("======REGISTER YOUR EMAIL=====");
        String email = scanner.nextLine();
        register.setEmail(email);

//        //REGISTRATION COMPLETE
//        System.out.println(ANSI_GREEN + "=====REGISTRATION COMPLETE=====" + ANSI_RESET);
//        String regComplete = username + login + password + email;
//        System.out.print(regComplete);


    }

    public static void CaptchaProtect() {

        boolean success = false;

        Scanner scannerCaptcha = new Scanner(System.in);

        do {

            int a = 11111; // генерация числа от
            int b = 99999; // генерация числа до

            int randomNumber = a + (int) (Math.random() * b); // генерация числа от 11111 до 99999
            System.out.println("=====ENTER CAPTCHA=====");
            System.out.println("=====" + "[" + randomNumber + "]" + "=====");
            int captchaEnter = scannerCaptcha.nextInt();

            success = (captchaEnter == randomNumber);

            if (success) {
                System.out.print(ANSI_GREEN + "=====CAPTCHA ACCEPT=====" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "=====CAPTCHA WRONG!=====" + ANSI_RESET);
            }
        } while (!success);
    }

    public static void main(String[] args) {
        RegistrationAccount();
        CaptchaProtect();


    }
}
