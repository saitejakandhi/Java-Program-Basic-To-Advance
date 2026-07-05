import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year:");
        int year = sc.nextInt();
        if(year % 4 == 0 || year % 400 == 0 && year != 100){
            System.out.println("It Is LeapYear");
        }
        else{
            System.out.println("It Is Not Leapyear");
        }
    }
    
}
