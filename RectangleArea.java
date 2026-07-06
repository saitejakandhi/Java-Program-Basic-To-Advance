import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length:");
        int length = sc.nextInt();
        System.out.print("enter the height:");
        int height = sc.nextInt();
        int Area = length * height;
        System.out.println("Area :"+Area);
        height = height + 2;
        System.out.println(height);

    }
    
}
