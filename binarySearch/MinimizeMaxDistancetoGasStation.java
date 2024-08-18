package binarySearch;

import java.util.*;



//     public static double minimiseMaxDistance(int[] arr, int k) {
//         int n = arr.length;
//         int[] howMany = new int[n - 1];

//         for (int gasStations = 1; gasStations <= k; gasStations++) {
//             double maxLength = -1;
//             int maxIndex = -1;
//             for (int i = 0; i < n - 1; i++) {
//                 double diff = arr[i + 1] - arr[i];
//                 double sectionLength = diff / (howMany[i] + 1);
//                 if (sectionLength > maxLength) {
//                     maxLength = sectionLength;
//                     maxIndex = i;
//                 }
//             }
//             howMany[maxIndex]++;

//         }
        
//         double maxAns = -1;
//         for (int i = 0; i < n - 1; i++) {
//                 double diff = arr[i + 1] - arr[i];
//                 double sectionLength = diff / (howMany[i] + 1);
//             maxAns = Math.max(maxAns, sectionLength);
//         }
//         return maxAns;
 
//     }



class Pair {
    double length;
    int index;

    public Pair(double length, int index) {
        this.length = length;
        this.index = index;
    }
}

public class MinimizeMaxDistancetoGasStation {
    public static double minGasStation(int[] arr, int k) {
        int n = arr.length;
        int[] howMany = new int[n - 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.length, a.length)); // Corrected the comparator

        for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair(arr[i + 1] - arr[i], i));
        }

        for (int gasStations = 1; gasStations <= k; gasStations++) {
            Pair p = pq.poll();
            

            int maxIndex = p.index;

            // Insert the gas station
            howMany[maxIndex]++;

            double diff = arr[maxIndex + 1] - arr[maxIndex];
            double secLen = diff / (double) (howMany[maxIndex] + 1);
            pq.add(new Pair(secLen, maxIndex));

           
        }

        return pq.peek().length;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 12, 19, 33, 44, 67, 72, 89, 95 };
        int k = 2;
        double result = minGasStation(arr, k);
        System.out.println("Final maximum distance: " + result);
    }
}
