import java.util.Scanner;

public class CheckPositiveOrNegativeOrZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("positive number..");
        }
        else if(n < 0){
            System.out.println("negative number..");
        }
        else{
            System.out.println("zero..");
        }
    }
}