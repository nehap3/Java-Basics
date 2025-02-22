//Sum of 4 digits of a number

public class P4 {
    public static void main(String[] args) {
        int n=3456;
        int n1,n2,n3,n4,sum;
        n1=n%10;
        n=n/10;
        n2=n%10;
        n=n/10;
        n3=n%10;
        n=n/10;
        n4=n%10;
        n4=n;
        sum=n1+n2+n3+n4;
        System.out.println("Summation is: "+sum);
    }
    
}
