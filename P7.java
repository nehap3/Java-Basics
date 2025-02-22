//Swap without using third Variable
 
public class P7 {
    public static void main(String[] args) {
        int n1,n2;
        n1=34;
        n2=43;
        System.out.println("Before Swapping: n1= "+n1+" ,n2= "+n2);
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("After Swapping: n1= "+n1+" ,n2= "+n2);
    }
    
}
