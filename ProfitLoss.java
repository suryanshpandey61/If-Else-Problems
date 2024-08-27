import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Cost Price:=");
        double cost_price=sc.nextDouble();
        System.out.print("Enter the Selling Price:=");
        double selling_price=sc.nextDouble();

        if(selling_price>cost_price){
            double profit=selling_price-cost_price;
            System.out.println("Profit Amount is: "+profit);
        }
      
        else{
            double loss=cost_price-selling_price;
            System.out.println("Loss Amount is : -"+loss);
        }
      
    }
}
