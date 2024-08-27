import java.util.Scanner;
public class ValidTriangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the 1st side:=");
    int x=sc.nextInt();
    System.out.print("Enter the 2nd side:=");
    int y=sc.nextInt();
    System.out.print("Enter the 3rd side:=");
    int z=sc.nextInt();

    if(x+y>z && y+z>x && z+x>y){
        System.out.println("These side form an Valid triangle");
    }
    else{
        System.out.println("This side Not Form an Valid triangle");
    }
   } 

}
