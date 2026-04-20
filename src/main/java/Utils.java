public class Utils {

    public static int sum(int a, int b) {
        return (a+b);
    }
    public static int max(int a, int b) {
        return (Math.max(a,b));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,15));
        System.out.println(max(5,15));
        System.out.println(isEven(15));
    }
}
