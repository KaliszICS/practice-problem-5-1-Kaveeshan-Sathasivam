/*File: Practice Problem 5.1
Author: Kaveeshan Sathasivam
Date Created: May 1st, 2026
Date Last Modified: May 1st, 2026
 */

public class PracticeProblem {

    public static int[] createIntArray() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static String[] createArray(String a, String b, String c, String d) {
        String[] arr = new String[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        return arr;
    }

    public static String getElement(int n, String[] arr) {
        return arr[n];
    }

    // Now returns the modified array instead of void
    public static double[] replaceElement(int n, double value, double[] arr) {
        arr[n] = value;
        return arr;
    }

}