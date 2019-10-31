public class Main {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
    public static void main(String[] args) {
        System.out.println("############5616 = "+maskify("4556364607935616"));
        System.out.println("#######5616 = "+ maskify(     "64607935616"));
        System.out.println("1 = "+                maskify(               "1"));
        System.out.println(" = "+                 maskify(                ""));
    }
}
