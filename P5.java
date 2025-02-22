//Reverse of a 4 digit numbers
public class P5 {
    public static void main(String[] args) {
        int n=3456;
        int n1,n2,n3,n4,rev;
        n1=n%10;
        n=n/10;
        n2=n%10;
        n=n/10;
        n3=n%10;
        n=n/10;
        n4=n%10;
        n4=n;
        rev=n1*1000+n2*100+n3*10+n4*1;
        System.out.println("Reverse of a 4 digit numebr" +n+" is:"+rev);
    }
    
    }
    

