import java.util.Arrays;

public class Main {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
    public static void main(String[] args) {
        System.out.println("bitcoin take over the world maybe who knows perhaps = 3 Result = " + findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println("turns out random test cases are easier than writing out basic ones = 3 Result = " + findShort("turns out random test cases are easier than writing out basic ones"));
    }
}
