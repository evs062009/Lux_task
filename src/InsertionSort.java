import java.util.Arrays;

public class InsertionSort {

    public static int [] sort(int [] ints) {
        int [] newArr = Arrays.copyOf(ints, ints.length);

        for (int i = 1; i < newArr.length; i++) {
            int element = newArr[i];
            int j = i;
            for ( ; (j > 0) && (newArr[j - 1] > element); j--) {
                newArr[j] = newArr[j - 1];
            }
            newArr[j] = element;
        }
        return newArr;
    }
}