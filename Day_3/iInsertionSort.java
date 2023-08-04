import java.util.Arrays;

public class iInsertionSort {

    public static void insertionSort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {

            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 67, 789, 87, 51, 99 };

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
