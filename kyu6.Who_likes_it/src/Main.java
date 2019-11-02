public class Main {
    public static void main(String[] args) {
        System.out.println("no one likes this --> "+whoLikesIt() + " " + whoLikesIt().equals("no one likes this"));
        System.out.println("Peter likes this --> "+whoLikesIt("Peter") + " " + whoLikesIt("Peter").equals("Peter likes this"));
        System.out.println("Jacob and Alex like this --> "+whoLikesIt("Jacob", "Alex") + " " + whoLikesIt("Jacob", "Alex").equals("Jacob and Alex like this"));
        System.out.println("Max, John and Mark like this --> "+whoLikesIt("Max", "John", "Mark") + " " + whoLikesIt("Max", "John", "Mark").equals("Max, John and Mark like this"));
        System.out.println("Alex, Jacob and 2 others like this --> "+whoLikesIt("Alex", "Jacob", "Mark", "Max") + " " + whoLikesIt("Alex", "Jacob", "Mark", "Max").equals("Alex, Jacob and 2 others like this"));
        System.out.println("Alex, Jacob and 10 others like this --> "+whoLikesIt("Alex", "Jacob", "Mark", "Max", "Mark", "Max", "Mark", "Max", "Mark", "Max", "Mark", "Max") + " " + whoLikesIt("Alex", "Jacob", "Mark", "Max", "Mark", "Max", "Mark", "Max", "Mark", "Max", "Mark", "Max").equals("Alex, Jacob and 10 others like this"));

    }
    public static String whoLikesIt(String... names) {
        switch (names.length){
            case (0): return "no one likes this";
            case (1): return names[0]+ " likes this";
            case (2): return names[0] + " and " + names[1] + " like this";
            case (3): return names[0] +", " + names[1] + " and " + names[2] + " like this";
            default: return names[0]+ ", " + names[1] + " and " + (names.length-2) +" others like this";
        }
    }
}
