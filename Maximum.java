import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
//    Finding max by comparing the max with each elemnent in array
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
        }
        System.out.println("Maximum Number in the Array is: "+max);
    }
}
