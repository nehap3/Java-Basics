//Multiplication

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,sum=1,rem;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum*=rem;
            num=num/10;
           
        }
        System.out.println("Multiplication of a Number is: "+sum);
        
    }
    
    
}
