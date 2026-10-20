package com.plurasight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String fullName = getFullName(myScanner);
        printFullName(fullName);
    }
    public static void printFullName(String name){
        System.out.println("Full Name: "+name);
    }
    public static String getFullName(Scanner scanner){
        System.out.println("please enter your name? ");
        System.out.print("First name: ");
        String firstName =(scanner.nextLine()).trim();
        System.out.print("Middle name: ");
        String middleName = (scanner.nextLine()).trim();
        System.out.print("Last name: ");
        String lastName = (scanner.nextLine()).trim();
        System.out.print("Suffix: ");
        String suffix = (scanner.nextLine()).trim();




        String fullName = firstName + " "+middleName+" "+lastName+", "+suffix;
        return fullName;
    }
}


