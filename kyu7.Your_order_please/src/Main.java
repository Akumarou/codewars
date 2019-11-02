import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a") + " --> Thi1s is2 3a T4est");
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2") + " --> Fo1r the2 g3ood 4of th5e pe6ople");
        System.out.println(order("") + " --> ");
    }
}
