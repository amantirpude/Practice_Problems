import java.util.*;
public class SmallestNumber {
    public static int smallest(int[] arr){
        int mini = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SmallestNumber.smallest(arr));
    }
}
