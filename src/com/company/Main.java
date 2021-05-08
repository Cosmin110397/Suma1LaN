package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number: ");
        Scanner number = new Scanner(System.in);
        num =number.nextInt();
        int sum=0;
        System.out.println("The sum of the numbers 1 to num is: ");
        for(int i=1; i<=num; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
