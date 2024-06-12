// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class bubblesortOptimized {
    public static void main(String[] args) {
    //   int[] arr = {5,4,3,2,1};
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    //bubble sort 
    for(int i=n-1;i>=1;i--){
        int didSwap = 0;
        for(int j=0 ; j <= i-1 ;  j++){
            if(arr[j] > arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                didSwap = 1;
            }
        }
            if(didSwap == 0) {
                break;
            }
        System.out.println("swapped");
    }
    
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
    
      
    }
}