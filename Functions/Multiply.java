public class Multiply{
    public static int multiplyTwoNumbers(int a, int b){//function with parameters
    int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int prod = multiplyTwoNumbers(a, b);
        System.out.println("The product is: "+prod);
    }
}