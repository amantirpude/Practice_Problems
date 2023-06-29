import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<arr.length; i++){
            st.push(arr[i]);
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(st.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);

    }
}
