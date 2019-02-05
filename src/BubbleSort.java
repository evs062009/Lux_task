import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] ints = {5, 7, 1, 3, 2, 0};

        System.out.print("original array:\t");
        System.out.println(Arrays.toString(ints));
        int [] sortedInts = sort(ints);
        System.out.print("sorted array:\t");
        System.out.println(Arrays.toString(sortedInts));
    }

    private static int [] sort(int [] ints) {
        int [] newArr = Arrays.copyOf(ints, ints.length);
        boolean noSwap = true;

        for (int i = newArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (newArr[j] > newArr[j + 1]){
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap){
                break;
            }
        }
        return newArr;
    }
}
