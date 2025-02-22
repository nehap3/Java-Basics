//Find total marks & Percentage
public class P9 {
    public static void main(String[] args) {
        int n1,n2,n3,total;
        double percentage;
        n1=50;
        n2=45;
        n3=49;
        int out=150;
        total=n1+n2+n3;
        percentage=(total*100.0)/out;
        System.out.println("Total Marka: "+total);
        System.out.printf("Percentage: %.2f%%",percentage);

    }
    
}
