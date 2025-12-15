
import java.util.Scanner;

public class Factorial{
    public static int factorial(int n){
        Scanner sc=new Scanner(System.in);
          n = sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("The factorial is: "+factorial(0));
    }
}