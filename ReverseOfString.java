import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.print( "Reverse of string:"+reverse);
    }
    
}
