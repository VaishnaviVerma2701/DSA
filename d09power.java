import java.util.*;

class power {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double a = myPow(x, n / 2);
        // is n is even
        if (n % 2 == 0) {
            return a * a;

        }
        // if n is nagative
        else if (n < 0) {
            return 1 / myPow(x, -n);

        }
        // if n is odd
        else
            return a * a * x;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        power p = new power();
        System.out.println("enter the number");

        int n = sc.nextInt();
        double x = sc.nextDouble();
        System.out.print(p.myPow(x, n));
    }
}

// Bubble sort in recurtion
class bubblesort1 {
    public static void bubbleSort1(int[] arr, int n) {
        if (n == 0)
            return;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bubbleSort1(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        int n = 5;
        bubbleSort1(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}