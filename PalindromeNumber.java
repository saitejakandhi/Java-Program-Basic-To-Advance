import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if(original == rev){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("is not palindrome number");
        }
    }
    
}
