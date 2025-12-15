import java.util.Scanner;
public class CheckPrime{
   public static boolean isPrime(int n){
    if(n==0 || n==1){ 
        return false;
        }
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0)
                 
                    return false;
            }
        }
        return true;
   }

// primInRange how many prime numbers are there in the range of 1 to n
public static void primInRange(int n){
    for(int i=2; i<=n; i++){          // start at 2 (1 is not prime)
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      System.out.println(" "+isPrime(n));
    System.out.println("The prime numbers in the range of 1 to "+n+" are: ");
    primInRange(n);
    }
} 