
import java.util.Scanner;
public class JavaBasic{
    public static void main (String args[]){
        // System.out.println("surajkumar");

        // 1.<--- calculate sum by input of user --->
       /* Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println(sum);*/

        // 2. <---calculate area of circle --->
        Scanner sc = new Scanner(System.in);
        float pi=sc.nextFloat();
         int r=sc.nextInt();
        float area= pi*r*r;
        System.err.println(area);

    }
}