import java.util.Scanner;
public class CheckDigit {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter an Value:=");
     char ch = sc.next().charAt(0);
     if((ch>=97 && ch<=122)|| (ch>=65 && ch<=90))
     {
        System.out.println(ch+" is an Alphabet");
     }
     else if (ch>=48 && ch<=57){
        System.out.println(ch+" is an Digit");
     }
     else{
        System.out.println(ch+" is an Special Symbol");
     }
   } 
}
