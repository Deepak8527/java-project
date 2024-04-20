package javaproject;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number and second number : ");
        int firstnum = scanner.nextInt();
        int secondnum = scanner.nextInt();
        int sum = firstnum + secondnum;
        int sub = firstnum - secondnum;
        int mul = firstnum * secondnum;
        int div = firstnum / secondnum;
        System.out.println("Additon is : " + sum);
        System.out.println("subtraction is : " + sub);
        System.out.println("multiplication is : " + mul);
        System.out.println("division is : " + div);
    }
}
