import java.util.Scanner;

public class SecondSmallLarge {
    public static void secondSmallLarge(int[] arr){
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_small = Integer.MAX_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] >second_large && arr[i] != large){
                second_large = arr[i];
            }
        }
        System.out.println(second_small + " " + second_large);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        SecondSmallLarge.secondSmallLarge(arr);
    }
}
