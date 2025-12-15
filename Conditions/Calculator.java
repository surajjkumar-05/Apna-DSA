
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        int a= sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        System.out.println("enter operator : ");
        char operator =sc.next().charAt(0);
       
       switch (operator) {
           case '+': System.out.println("addition is :"+(a+b));
                      break;
           case '-': System.out.println("subtraction is :"+(a-b));
                     break;
           case '*': System.out.println("mulltiplication is :"+(a*b));
                    break;
           case '/': System.out.println("division is :"+(a/b));
   
                    break;
           case '%': System.out.println("mudul is :"+(a%b));


           default: System.err.println("Wrong operator enter!");
              
       }
        

    }
}