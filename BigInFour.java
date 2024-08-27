import java.util.Scanner;
class BigInFour{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of 1st no=");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd no=");
        int b=sc.nextInt();
        System.out.print("Enter th3 3rd no=");
        int c=sc.nextInt();
        System.out.print("Enter the 4th no=");
        int d=sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println("Biggest no is :"+a);
        }
        else if(b>c && b>d)
        {
            System.out.println("Biggest no is :"+b);
        }
        else if(c>d){
            System.out.println("Biggest no is :"+c);
        }
        else{
            System.out.println("Biggest no is :"+d);
        }
    }
}