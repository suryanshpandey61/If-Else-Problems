import java.util.Scanner;
public class TypeTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Side:=");
        int x=sc.nextInt();
        System.out.print("Enter the 2nd Side:=");
        int y=sc.nextInt();
        System.out.print("Enter the 3rd Side:=");
        int z=sc.nextInt();

        if((x==y) && !(x==z))
        {
            System.out.println("These side form an Isosceles Triangle");
        }
        else if(x==y && x==z){
            System.out.println("These side form an Equilateral triangle");
        }
        else{
            System.out.println("These side form an Scalene Triangle");
        }
    }
}
