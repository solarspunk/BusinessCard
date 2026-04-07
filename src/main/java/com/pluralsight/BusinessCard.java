package com.pluralsight;

public class BusinessCard {
    public static void main(String[] args) {
        String name = "Michael Cardenas";
        String github = "https://github.com/solarspunk";
        String linkedin = "https://www.linkedin.com/in/michael-cardenas-a701873b8/";
        String motto = "Work hard. Be strong. Don't complain.";
        int age = 21;
        char initial = 'M';
        double gpa = 4;
        float hourlyRate = 22.5f;
        long phoneNumber = 16613098294L;
        boolean availableForWork = true;

        System.out.println("================================================");
        System.out.println("MY BUSINESS CARD");
        System.out.println("================================================");
        System.out.println("Initial  : " + initial);
        System.out.println("Name     : " + name);
        System.out.println("GitHub   : " + github);
        System.out.println("LinkedIn : " + linkedin);
        System.out.println("Age      : " + age);
        System.out.println("GPA      : " + gpa);
        System.out.println("Rate     : $" + hourlyRate + " per hour");
        System.out.println("Phone    : +" + phoneNumber);
        System.out.println("Available: " + availableForWork);
        System.out.println("Motto    : " + motto);
        System.out.println("================================================");


    }
}
