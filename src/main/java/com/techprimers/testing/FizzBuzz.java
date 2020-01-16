package com.techprimers.testing;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        System.out.println("===Feature branch 2===");
        System.out.println("===I am from Feature 1 =====");
        return String.valueOf(number);
    }
}
