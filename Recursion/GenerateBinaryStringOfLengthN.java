import java.util.*;

public class GenerateBinaryStringOfLengthN {
    public static List<String> generateBinaryStrings(int n) {
         List<String> res = new ArrayList<>();
         f(res,"", n);
         return res;

    }

    public static void f(List<String> res, String ref, int n) {
        if (ref.length() == n) {
            res.add(ref);
            return;
        }
        f(res, ref + '0', n);
        if (ref.isEmpty() ||ref.charAt(ref.length()-1) != '1') {
            f(res, ref + '1', n);
        }
        
  } 
    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<>();
        res = generateBinaryStrings(n);
        System.out.println(res);

    }
}
