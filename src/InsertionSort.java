import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] ints = {5, 7, 1, 3, 2, 0};

        System.out.print("original array:\t");
        System.out.println(Arrays.toString(ints));
        int [] sortedInts = sort(ints);
        System.out.print("sorted array:\t");
        System.out.print(Arrays.toString(sortedInts));
    }

    private static int [] sort(int [] ints) {
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