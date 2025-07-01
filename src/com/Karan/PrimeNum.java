package com.Karan;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        if (num == 2) return true;   // 2 is prime

        // Check from 2 to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
