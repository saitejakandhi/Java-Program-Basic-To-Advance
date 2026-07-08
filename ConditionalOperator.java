public class ConditionalOperator{
public static void main(String[] args){
int marks = 35;
String Marks = ((marks >= 35 )? "Student passed" : "Student failled");
System.out.println(Marks);

int a = 10;
int b = 20;
System.out.println((a > b) ? a : b);

int number = 40;
System.out.println((number % 2 == 0)? "even" : "odd");

int vote = 19;
System.out.println((vote >= 18)?"eligible" :"not eligible");

int num = 30;
System.out.println((num > 0)?"positive" :"negative");

int salary = 48000;
System.out.println((salary > 50000)?"High" :"low");

int n = 18;
System.out.println((n % 2 == 0)? n * n : n * n * n);

int amount = 5000;
int balance = 6500;
System.out.println((amount <= balance) ? "Transaction successfull" : "insufficient balance");

int stumarks = 80;
System.out.println((stumarks >= 90) ? "A" :(stumarks >= 75)  ? "B" :(stumarks >= 50)  ?"C" : "fail");

int numbers = -10;
System.out.println((numbers < 0) ? "positive" :(numbers > 0) ? "negative" : "zero");

int purchase = 6000;
System.out.println((purchase >= 1000) ? purchase * 0.90 + "discount" : " no discount");

char ch = 'J';
System.out.println((ch > 'a' && ch < 'z' ) ? "lowercase" : (ch > 'A' && ch < 'Z') ? " uppercase" : (ch > '0' && ch < '9') ? "digit" : "special characters" );



}
}