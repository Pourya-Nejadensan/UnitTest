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

    public static int multiple(int a, int b){
        return a * b;
    }

    public static String toUpperCase(String string){
        return string.toUpperCase();
    }

    public static boolean isPositive(int a){
        return a > 0;
    }
}
