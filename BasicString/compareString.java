// time complexity O(x*n) x is  number of  letter in all string
public class compareString {

    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mongo"};
        String largeString = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largeString.compareTo(fruits[i]) < 0) {
                largeString = fruits[i];
            }
        }
        System.out.println("largest string is:" + largeString);
    }
}
