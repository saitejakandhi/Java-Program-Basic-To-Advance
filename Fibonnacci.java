import java.util.Scanner;

public class Fibonnacci {
    public static int fibonnacci(int n){
        if(n == 0)return 0;
        if(n == 1)return 1;
        return fibonnacci(n - 1) + fibonnacci(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            System.out.println(fibonnacci(i));
        }

    }
    
}
