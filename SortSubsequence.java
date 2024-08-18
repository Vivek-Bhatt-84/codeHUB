import java.util.*;
public class SortSubsequence {
    static ArrayList<String> list = new ArrayList<>();
    public static void sort(String str,int i,String res) {
        if (i< 0) {
            list.add(res);
            return;
        }
        // not pick 
         sort(str,i-1,res); 
        //pick 
        sort(str, i - 1, res += str.charAt(i)); 
    }
    public static void main(String[] args) {
        String str = "abc";
        sort(str, str.length() - 1, "");
        Collections.sort(list);
        System.out.println(list);
    }
}
