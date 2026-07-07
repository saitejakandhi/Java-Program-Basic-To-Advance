import java.util.Arrays;
import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        System.out.print("before sorted:");
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("after sorted:");
        for(int i = 0; i < n;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
