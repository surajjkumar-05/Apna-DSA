
public class getset {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask= 1<<i;
        return n| bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask= 1<<i;
        return n & ~bitMask;
    }

    public static int clearLastIBit(int n, int i){
        int bitMask= (~0)<<i;// we can write here ~0 or -1
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println("Ith bit is: " + getIthBit(10, 2));
        // System.out.println("Ith bit is: " + setIthBit(10, 2));
        // System.out.println("Ith bit is: " + clearIthBit(10, 1));
        // System.out.println("Ith bit is: " +clearLastIBit(15, 2));
    }
}
