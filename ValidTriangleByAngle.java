import java.util.Scanner;
public class ValidTriangleByAngle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter the 1st Angle:=");
       int x=sc.nextInt();
       System.out.print("Enter the 2nd Angle:=");
       int y=sc.nextInt();
       System.out.print("Enter the 3rd Angle:=");
       int z=sc.nextInt();

       if(x>0 && y>0 && z>0)
       {
        if(x+y+z==180){
            System.out.println("These Angle form an Valid Triangle");
        }
        else{
            System.out.println("These angle not form an Valid triangle");
           }
       }
       else{
            System.out.println("These angle not form an Valid triangle");  
       }
       
    }
}
