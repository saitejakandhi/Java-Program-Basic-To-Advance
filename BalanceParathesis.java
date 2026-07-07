import java.util.Scanner;
import java.util.Stack;

public class BalanceParathesis {
    public static boolean isbalance(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == '}' && top != '{')||
                  (ch == ']' && top != '[')||
                  (ch == ')' && top != '(')){
                    return false;

                  }
            }
        }
        return(stack.isEmpty());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Parathesis.");
        String str = sc.nextLine();
        if(isbalance(str)){
            System.out.println("Balance Parathesis...");
        }
        else{
            System.out.println("is not Balance Parathesis");
        }
    }
    
}
