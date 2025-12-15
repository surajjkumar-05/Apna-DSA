
import java.util.Scanner;


public class Class{
  public static void main(String[] args) {
    int marks[]=new int[20];
    Scanner sc= new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();

System.err.println("physics:" +marks[0]);
System.err.println("chemistry:" +marks[1]);
System.err.println("mathematics:" +marks[2]);
int percentage=(marks[0]+marks[1]+marks[2])/3;
System.err.println("percentage =" +percentage+"%");
  }  
}