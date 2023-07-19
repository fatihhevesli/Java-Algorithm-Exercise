import java.util.*;

public class Main {
    public static void main(String[] Args) {
        System.out.printf(String.valueOf(buddyStrings("aaaaaaabc", "aaaaaaacb")));
    }

    public static boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (char c : A.toCharArray())
                set.add(c);
            return set.size() < A.length();
        }

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < A.length(); ++i)
            if (A.charAt(i) != B.charAt(i)) diff.add(i);

        return diff.size() == 2 &&                            //
                A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && //
                A.charAt(diff.get(1)) == B.charAt(diff.get(0));


    }
}

