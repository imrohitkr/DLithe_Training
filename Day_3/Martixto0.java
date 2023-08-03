import java.util.*;

class Matrixto0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < m; i++) {
            row[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            col[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            System.out.println("Enter row num:" + i);
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i] == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i] == 0) {
                for (int j = 0; j < n; j++) {
                    mat[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}