import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] ints = {5, 7, 1, 3, 2, 0};

        System.out.print("original array:\t");
        System.out.println(Arrays.toString(ints));
        int [] sortedArr = sort(ints);
        System.out.print("sorted array:\t");
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int [] sort(int [] ints) {
        int [] newArr = Arrays.copyOf(ints, ints.length);
        for (int i = 0; i < newArr.length - 1; i++) {
            int min = newArr[i];
            int minIndex = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] < min) {
                    min = newArr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = newArr[minIndex];
                newArr[minIndex] = newArr[i];
                newArr[i] = temp;
            }
        }
        return newArr;
    }

//    private static void print(int [] ints) {
//        for (int i: ints
//             ) {
//            System.out.print(i + ", ");
//        }
//    }
}
