import java.net.URLEncoder;
import java.util.Arrays;

public class Main {
    public static void main(String[] Args){
        System.out.println(isAnagram("rac","car"));
    }

    public static boolean isAnagram(String s,String t) {
        if (s.length() != t.length()){
            return false;
        }

       char[] s1 = s.toCharArray();
       char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);

    }

}
