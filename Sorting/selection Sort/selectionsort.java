// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    //selection sort 
    for(int i = 0 ; i< n-1 ; i++){
        int mini = i;
        for(int j = i+1 ; j< n; j++){
            if(arr[j] < arr[mini]){
                mini = j;
            }
            
        }
            int tmp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = tmp;
    }
      System.out.println(Arrays.toString(arr));
    
    }
}