
import java.util.Scanner;

public class Passfail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        String status=(marks>=33)?"pass":"fail";
        System.err.println(status);
    }
}