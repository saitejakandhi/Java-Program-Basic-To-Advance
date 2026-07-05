import java.util.Scanner;

public class AddFirstAndLastDigitNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        String num = sc.nextLine();
        int firstdigit = num.charAt(0) -'0';
        int lastdigit = num.charAt(num.length()- 1) -'0';
        int result = firstdigit + lastdigit;
        System.out.println(result);
    }
    
}
