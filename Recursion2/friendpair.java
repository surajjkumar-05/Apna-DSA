
public class friendpair {

    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int singlefriend = friendsPair(n - 1);
        // pair
        int doublefriend = friendsPair(n - 2);
        int pairWay = (n - 1) * doublefriend;
        // totalway
        int totalWay = singlefriend + pairWay;
        return totalWay;
        // return  friendsPair(n-1) + (n-1) * friendsPair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}
