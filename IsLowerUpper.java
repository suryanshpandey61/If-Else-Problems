import java.util.Scanner;
public class IsLowerUpper {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter some value to check is lower or upper:=");
    char ch=sc.next().charAt(0);
    if (ch>=97 && ch<=122) {
        System.out.println(ch+" is a Lower Case Alphabet");
    }
    else if(ch>=65 && ch<=90){
        System.out.println(ch+ " is an Upper Case Alphabet");
    }
    else{
        System.out.println(ch+" Not an Alphabet");
    }
  }
}
