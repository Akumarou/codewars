import java.util.*;

public class Main {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> squares = new ArrayList<Integer>();
        int area = lng * wdth;
        while (area > 0) {
            squares.add(Math.min(lng,wdth));
            if (wdth > lng)wdth = wdth - lng;
            else lng = lng - wdth;
            area = lng * wdth;
        }
        return squares;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(3);
        ans.add(2);
        ans.add(1);
        ans.add(1);
        System.out.println(sqInRect(5,3).equals(ans));
    }

}
