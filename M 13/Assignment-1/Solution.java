/**
 * import Buffered input stream.
 */
import java.io.BufferedInputStream;
/**
 * import Scanner.
 */
import java.util.Scanner;
/**
 * import Arrays.
 */
import java.util.Arrays;

/**
 * Class for set.
 * @author : Mahateja
 */
class Set {
    /**
     * ten.
     */
    private final int ten = 10;
    /**
     * Integer array.
     */
    private int[] arr = new int[ten];
    /**
    * size.
    */
    private int size = 0;
    /**
     *
     * @return     size
     */
    public int size() {
        return size;
    }
    /**
     *
     * @param      item  The item
     *
     * @return     boolean
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == arr[i]) {
                return true;
            }
        } return false;
    }
    /**
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            arr[size++] = item;
        }
    }
    /**
     *
     * @param      items  The items
     */
    public void add(final int[] items) {
        for (int i:items) {
            add(i);
        }
    }
    /**
     *
     * @param      t     Set
     *
     * @return     Set
     */
    public Set intersection(final Set t) {
        Set set = new Set();
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < t.arr.length; j++) {
                if (this.arr[i] == t.arr[j] & this.arr[i] != 0) {
                    set.add(arr[i]);
                }
            }
        } return set;
    }
    /**
     *
     * @param      items  int array
     *
     * @return     Set
     */
    public Set retainAll(final int[] items) {
        Set set = new Set();
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < items.length; j++) {
                if (this.arr[i] == items[j]) {
                    set.add(arr[i]);
                }
            }
        } return set;
    }
    /**
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String s = "{";
        int i;
        for (i = 0; i < size - 1; i++) {
    	    s = s + arr[i] + "," + " ";
        } s = s + arr[i] + "}";
        return s;
    }
    /**
     *
     * @param      t     Set
     *
     * @return     int array
     */
    public int[][] cartesianProduct(final Set t) {
        final int ten1 = 10;
        final int ten2 = 10;
        int[][] a = new int[ten1][ten2];
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < t.arr.length; j++) {
                a[i][j] = arr[i];
            }
        } return a;
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s.toString());
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
