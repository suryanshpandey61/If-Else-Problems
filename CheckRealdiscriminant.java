import java.util.Scanner;
public class CheckRealdiscriminant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a:=");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:=");
        int b=sc.nextInt();
        System.out.print("Enter the value of c:=");
        int c=sc.nextInt();

        double discriminant=Math.sqrt((b*b)-4*a*c);

        if(discriminant>0){
            double real1=(-b+discriminant)/(2*a);
            double real2=(-b-discriminant)/(2*a);
            System.out.println("Real and Distinct discriminant are "+real1+ " and "+real2);
        }
        else if(discriminant==0){
            double real1=(-b+discriminant)/(2*a);
            double real2=(-b-discriminant)/(2*a);
            System.out.println("Real and Equal discriminant are "+real1+ " and "+real2);
        }
        else{
            System.out.println("Complex and Distinct discriminant");
        }



    }
}
