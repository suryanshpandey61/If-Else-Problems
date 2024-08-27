import java.util.Scanner;
public class IsDivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number:=");
        int n=sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println(n+" is Divisible by 5 and 11");
        }
        else{
            System.out.println(n+" is Not Divisible by 5 and 11");
        }
    }
}
