public class Main {
    public static long findNb(long m) {
        long summ = 0, n = 0;
        while (summ < m) summ += ++n * n * n;
        return summ == m ? n : -1;
    }

    public static void main(String[] args) {
        System.out.println(findNb(1071225) + "--> 45"  );
        System.out.println(findNb(91716553919377L) + " --> -1");
        System.out.println(findNb( 40539911473216L) + " --> 3568");
        System.out.println(findNb( 2152421129877334416L) + " --> 54168");



    }
}
