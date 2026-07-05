import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String:");
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("it is palindrome.");
        }
        else{
            System.out.println("it is not palindrome.");
        }
    }
    
}
