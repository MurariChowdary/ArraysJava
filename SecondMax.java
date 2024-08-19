import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("No Second Max");
            return;
        }

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, SecMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                SecMax = max;
                max = a[i];
            } else if (a[i] > SecMax && a[i] < max) {
                SecMax = a[i];
            }
        }

        if (SecMax == Integer.MIN_VALUE) {
            System.out.println("No Second Max");
        } else {
            System.out.println(SecMax);
        }
    }
}
