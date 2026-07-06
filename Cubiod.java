import java.util.Scanner;

public class Cubiod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length:");
        int length = sc.nextInt();
        System.out.print("enter the breadth:");
        int breadth = sc.nextInt();
        System.out.print("enter the height:");
        int height= sc.nextInt();
        System.out.print("the volume:");
        int volume = length * breadth * height;
        System.out.println(volume);
        // increase height two meters
        height = height + 2;
        System.out.println("after increase 2 m height value:" + height);
        int newvolume = length * breadth * height ;
        System.out.println("newvolume:" + newvolume);


    }
}