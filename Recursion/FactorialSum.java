
public class FactorialSum {

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int finSum = n + calcSum(n - 1);
        return finSum;
    }

    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
}
