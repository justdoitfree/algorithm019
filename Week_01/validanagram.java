import java.util.Arrays;

public class validanagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
    public void main(String[] args){
        System.out.println(isAnagram("ahnagram","nahgaram"));
    };
}