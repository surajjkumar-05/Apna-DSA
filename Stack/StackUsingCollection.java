import java.util.Stack;

public class StackUsingCollection{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}