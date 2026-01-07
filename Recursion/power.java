public class power{
    public static int optimizedPower(int a , int n){
        // Base case
        if( n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        // if odd number
        if( n%2 != 0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
       
        System.out.println(optimizedPower(2, 10));
    }
}