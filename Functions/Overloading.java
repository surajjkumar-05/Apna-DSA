public class Overloading{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
       System.out.println("The sum of 2, 5 and 8 is: "+sum(2, 5, 8));
       System.out.println("The sum of 2 and 5 is: "+sum(2, 5));
    }
}