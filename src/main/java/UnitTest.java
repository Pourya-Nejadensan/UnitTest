public class UnitTest {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(10,2));
        System.out.println(sum(1,20));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static boolean isEven(int a){
        return a % 2 == 0;
    }
}
