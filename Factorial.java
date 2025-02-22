//Factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,fact=1;
        System.out.println("Enter any number: ");
        num=sc.nextInt();
        while(num>0)
        {
            fact*=num;
            --num;
        }
        System.out.println("Factorial is: "+fact);

    }
    
}
