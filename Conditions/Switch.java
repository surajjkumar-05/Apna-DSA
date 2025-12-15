
import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1: System.err.println("samosa");
            case 2: System.err.println("litti-chokha");
            case 3: System.err.println("burger");
                
                
            default: System.err.println("we wake up");
             
        }
    }
}