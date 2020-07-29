import java.util.Arrays;
import java.util.List;

public class Test031 {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("ee", "se");
        String ans = nums.parallelStream()
                .reduce("", (a, b) -> a.concat(b));
        System.out.println(ans);
    }
}

