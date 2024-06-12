// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class InsertionSort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    // insertion sort 
    
    for(int i = 0 ;i <= n-1 ;i++){
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int tmp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = tmp;
            j--;
        }
    }
    
    System.out.println(Arrays.toString(arr));
    }
}