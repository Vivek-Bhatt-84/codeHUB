import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIdx = f(arr,low,high){
                quickSort(arr, low, pIdx-1);
                quickSort(arr,  pIdx+1,high);
            } 
        }
    }

    public static int f(int[] arr, int low, int high) {
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}