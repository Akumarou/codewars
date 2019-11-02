public class Main {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        var x = 0; var y = 0;
        for(int i=0;i<walk.length;i++)
        {
            if (walk[i] == 'n') x++;
            else if (walk[i]  == 's') x--;
            else if (walk[i]  == 'e') y++;
            else if (walk[i]  == 'w') y--;
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        System.out.println("assertEquals(\"Should return true\", true, TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));" + isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        System.out.println("assertEquals(\"Should return false\", false, TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));" +isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        System.out.println("assertEquals(\"Should return false\", false, TenMinWalk.isValid(new char[] {'w'}));"+isValid(new char[] {'w'}));
        System.out.println("assertEquals(\"Should return false\", false, TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));"+isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
