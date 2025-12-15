
import java.util.Scanner;

public  class Method{
public static void printMyName(){
    System.out.println("My name is Suraj Kumar");
}
public static void addTwoNumbers(int a, int b){//function with parameters
   
    
}
 public static void main(String[] args) {
    printMyName();
    
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("The sum is: "+sum);

}
}