import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] Args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDublicate(nums));
    }

    public static boolean containsDublicate(int[] nums) {
        Set<Integer> num = new HashSet<>();

        for (int number : nums) {
            if (num.contains(number)) {
                return true;
            }
            num.add(number);
        }
        return false;
    }
}
