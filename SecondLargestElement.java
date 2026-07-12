import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        System.out.print("enter the array element:");
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE ;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] !=  largest){
                secondlargest = arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("secondlargest element cannot be exists.");
        }
        else{
            System.out.println("secondlargestelement:" + secondlargest);
        }
    }
    
}
