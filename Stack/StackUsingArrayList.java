import java.util.ArrayList;

public class StackUsingArrayList {

    static class MyStack {
        private ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }
        // push
        public void push(int data) {
            list.add(data);
        }
        //  pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size() - 1);
        }
        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(24);
        s.push(8);
        s.push(6);
        s.push(2);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
