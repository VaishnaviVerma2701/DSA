import java.util.*;

// privious smaller element
class presmall {
    public static void priviousSmall(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && s.peek() > a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.println("-1" + " ");
            } else {
                System.out.println(s.peek() + " ");
            }
            s.push(a[i]);
        }
    }

    public static void main(String[] args) {
        presmall p = new presmall();
        int[] a = { 1, 3, 2, 5, 7, 3, 4, 8 };
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        priviousSmall(a);
    }
}

// previous larger element
class prelarger {
    public static void priviousLarge(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && s.peek() < a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print("-1" + " ");
            }

            else {
                System.out.print(s.peek() + " ");
            }
            s.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 7, 3, 4, 8 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        priviousLarge(a);
    }
}

// next larger element
class nextlarger {
    public static void nextLarger(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() < a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print("-1" + " ");
            }

            else {
                System.out.print(s.peek() + " ");
            }
            s.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 7, 3, 4, 8 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        nextLarger(a);
    }
}

// next smaller element
class nextsmaller {
    public static void nextSmaller(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() > a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print("-1" + " ");
            }

            else {
                System.out.print(s.peek() + " ");
            }
            s.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 7, 3, 4, 8 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        nextSmaller(a);
    }
}