package utilities;

import java.util.Arrays;
public class ArrayUtil {
    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }








}
