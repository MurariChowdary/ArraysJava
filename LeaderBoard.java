import java.util.Scanner;

public class LeaderBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[n-1];
        for (int i=n-1; i>0; i--) {
            if (nums[i-1]>= max){
                max = nums[i-1];
                System.out.print(max+" ");
            }
        }
    }
}
