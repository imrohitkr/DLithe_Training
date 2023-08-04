import java.util.*;

public class Minmax {
    public int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        Minmax m = new Minmax();
        System.out.println("Maximum value in the array is::" + m.max(myArray));
        System.out.println("Minimum value in the array is::" + m.min(myArray));
    }
}
