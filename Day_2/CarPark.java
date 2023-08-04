import java.util.*;

class CarPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int max = 0, maxo = 0;
        for (int i = 0; i < m; i++) {
            int count = 0;
            System.out.println(" Row " + i + 1);
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxo = i + 1;
            }
        }
        System.out.println("the row number " + maxo + " has most cars parked is" + max);
    }
}