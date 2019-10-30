public class Main {
    public static int GetSum(int a,int b){
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
    public static void main(String[] args) {
        //Given two integers a and b, which can be positive or negative,
        //find the sum of all the numbers between including them too and return it.
        //If the two numbers are equal return a or b.
        //Note: a and b are not ordered!
        System.out.println(GetSum(1, 0));   // 1 + 0 = 1
        System.out.println(GetSum(1, 2));   // 1 + 2 = 3
        System.out.println(GetSum(0, 1) );   // 0 + 1 = 1
        System.out.println(GetSum(1, 1) );  // 1 Since both are same
        System.out.println(GetSum(-1, 0) ); // -1 + 0 = -1
        System.out.println(GetSum(-1, 2) ); // -1 + 0 + 1 + 2 = 2
    }
}
