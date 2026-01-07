
public class Linkedlistt {

    // ========= NODE =========
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // ========= PRINT =========
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ========= CYCLE DETECTION =========
    public static boolean isCycle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // ========= REMOVE CYCLE =========
    public static void removeCycle() {
        Node slow = head, fast = head;
        boolean cycle = false;

        // detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // find last node of cycle
        Node prev = fast;
        while (prev.next != fast) {
            prev = prev.next;
        }

        prev.next = null;
    }

    // ========= MERGE SORT =========
    private Node getMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node h1, Node h2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }

        temp.next = (h1 != null) ? h1 : h2;
        return dummy.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    // ========= MAIN =========
    public static void main(String[] args) {
        Linkedlistt ll = new Linkedlistt();

        /*  head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());*/
        // create list
        head = new Node(6);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        System.out.println("Before sort:");
        ll.print();

        head = ll.mergeSort(head);

        System.out.println("After sort:");
        ll.print();
    }
}
