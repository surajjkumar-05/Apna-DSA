
public class fibonacci {

    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        // int fnm1 = fib(n-1);
        // int fnm2 = fib(n-2);
        int fn = fib(n - 1) + fib(n - 2);
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("Sum of fibonacci number =" + fib(25));
    }
}
