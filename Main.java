package org.example;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidFirstName == false){
            System.out.println("Please enter valid name first name (starting with Capital letter and has minimum 3 letters).");
        }

        System.out.println("Enter Last name: ");
        boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",sc.nextLine());
        if(isValidLastName == false){
            System.out.println("Please enter valid surname (Last name should starts with captial letter and has minimum 3 characters).");
        }

        System.out.println("Enter email id: ");
        boolean isValidEmailId = Pattern.matches("^[a-z]{0,40}[@]{1}[a-z]{0,15}[.]{1}[a-z]{5}",sc.nextLine());
        if(isValidEmailId == false){
            System.out.println("Please enter valid email id.");
        }

        System.out.println("Enter mobile number: ");
        boolean isValidMblNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}",sc.nextLine());
        if(isValidMblNumber == false){
            System.out.println("Please enter valid mobile number - Eg. 91 9919819801, Country code followed by space and 10 digit number");
        }

        System.out.println("Please enter password: ");
        boolean isValidPassword = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",sc.nextLine());
        if(isValidPassword == false){
            System.out.println("Please enter valid password (Should have minimum 8 Characters,at least 1 Upper Case,at least 1 numeric number, Has exactly 1 Special Character).");
        }


    }
}