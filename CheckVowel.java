import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Alphabet to check is it vowel or consonant:=");
        char ch=sc.next().charAt(0);
        if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println(ch+" is an Vowel");
        }
        else if(((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) && 
        !((ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
         ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) )
        {
            System.out.println(ch+" is an Consonant");
        }
        else{
            System.out.println("Not an Alphabet");
        }
    }
}
