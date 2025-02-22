//Sum of Digits

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,rem;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            sum+=rem;
        }
        System.out.println("Sum of digtis of a number is: "+sum);
    }
    
}
