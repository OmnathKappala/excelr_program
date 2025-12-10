package com.excelR;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();
        try {
            authenticate(username, password);
        }
        catch (Exception e) { // catching child exception object and stroing in parent ref(UpCasting)
            System.err.println(e.getMessage()); // calling parent method which consist child implementation
        }
    }
    public static void authenticate(String username, String password)  throws RuntimeException{
        if(username.equals("omnath")){
            if(password.equals("omnath@123")){
                System.out.println(" Welcome "+username);
            }
            else{
//                throw new RuntimeException("Invalid  password");
                // creating  and throwing child class
                throw new CustomException("invalid password");
            }
        }
        else{
//           throw new RuntimeException("Invalid  username  enter correct username");
            throw new CustomException("invalid username");
        }

    }
}
