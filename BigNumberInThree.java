import java.util.Scanner;
class BigNumberInThree
{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first number");
    int x=sc.nextInt();
    System.out.print("Enter the second number");
    int y=sc.nextInt();
    System.out.print("Enter the third number");
    int z=sc.nextInt();

    if(x>y){
        if(x>z){
            System.out.println("The largest number is "+x);
        }
        else{
            System.out.println("The largest number is "+z);
        }
    }
    else if(y>z){
        System.out.println("The largest number is "+y);
   }
   else{
    System.out.println("The larget number is "+z);
   }
}
}
