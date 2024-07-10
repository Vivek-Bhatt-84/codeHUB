import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false; 
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map.containsKey(key)) {
                int freq = map.get(key);
                if (freq == 1) {
                    map.remove(key);
                }
            }
        }
        return map.isEmpty();
        

        
    }
    public static void main(String[] args) {
        
    }
}
