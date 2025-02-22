//Sum of 3 digits of a number
public class P3 {
    public static void main(String[] args) {
       int n=242;
       int n1,n2,n3,sum;
       n1=n%10;
       n=n/10;
       n2=n%10; 
       n3=n/10;
       sum=n1+n2+n3;
       System.out.println("Summation of 3 digits of a number is: "+sum);
    }
}
