
import java.util.Scanner;

public  class While{
    public static void main(String[] args) {
        // <-----class first----->

     /*  int  counter=1;
     while(counter<=10){
    // System.out.println("Counter: "+counter);
    System.err.println("all numbers: "+counter);
    counter++;
    }*/

        // <-----class second sum of natural Number----->
      
      Scanner sc = new Scanner(System.in);
      int naturalNumber=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<=naturalNumber){
      sum=sum+i;
      i++;
   
      }
       System.out.println("Sum of natural number: "+sum);
    }
}
