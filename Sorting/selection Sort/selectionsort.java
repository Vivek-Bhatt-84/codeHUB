// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class selectionsort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    //selection sort 
    for(int i = 0 ; i< n-2 ; i++){
        int mini = i;
        for(int j = i ; j< n-1; j++){
            if(arr[j] < arr[mini]){
                mini = j;
            }
            int tmp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = tmp;
            
        }
    }
      System.out.println(Arrays.toString(arr));
    
    }
}