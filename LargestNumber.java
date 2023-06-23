import java.util.Scanner;

public class LargestNumber {
    public static int largest(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println(LargestNumber.largest(arr));
    }
}
