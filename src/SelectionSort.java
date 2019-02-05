import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] ints = {5, 7, 1, 3, 2, 0};

        System.out.print("original array:\t");
        System.out.println(Arrays.toString(ints));
        sort(ints);
        System.out.print("sorted array:\t");
        System.out.println(Arrays.toString(ints));
    }

    private static void sort(int [] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            int min = ints[i];
            int minIndex = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = ints[minIndex];
                ints[minIndex] = ints[i];
                ints[i] = temp;
            }
        }
    }

//    private static void print(int [] ints) {
//        for (int i: ints
//             ) {
//            System.out.print(i + ", ");
//        }
//    }
}
