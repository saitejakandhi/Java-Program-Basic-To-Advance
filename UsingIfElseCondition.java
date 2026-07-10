import java.util.Scanner;
public class UsingIfElseCondition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username = "saileo";
        String password ="123456";
        System.out.print("enter the username:");
        String UserName = sc.nextLine();
        System.out.print("enter the password:");
        String Password = sc.nextLine();
        if(username.equals(UserName) && password.equals(Password)){
            System.out.println("login Successfull..");
        }
        else{
            System.out.println("login failled..");
        }
    }
    
}