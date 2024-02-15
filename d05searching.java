//import java.util.*;

class binary {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 11, 13, 15 };
        System.out.println("binary array");
        int n = 7;
        int x = 7;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (x == arr[m]) {

                System.out.println("in array position of x is =" + m);
                return;

            } else if (x > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        System.out.println("-1");
    }
}

class array {
    public static int binary(int[] arr, int n, int x) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (x == arr[m]) {
                return m;
            } else if (x > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 11, 13, 15 };
        int n = 7;
        int x = 7;
        System.out.println(binary(arr, n, x));
    }
}

// searching alog of 2d matrix in binary search
class matrix2d {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][n]) {
                int s = 0;
                int e = n;
                int m;
                while (s <= e) {
                    m = (s + e) / 2;
                    if (matrix[i][m] == target) {
                        return true;
                    } else if (target > matrix[i][m]) {
                        s = m + 1;
                    } else {
                        e = m - 1;
                    }
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
       
        int target = 3;
        int[][] matrix = { { 1, 2, 3, 6 }, { 7, 8, 9, 11 }, { 12, 13, 14, 15 } };
        System.out.println(searchMatrix(matrix,target));
    }
}