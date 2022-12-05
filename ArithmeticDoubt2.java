package Demo;
// Arithmetic operation always return max type
// max(int, type of firstValue, type of secondValue)
/**
 integral(byte, short, int, long) by zero will return arithmetic exception
 but float or double by zero will return infinity
 * */
public class ArithmeticDoubt2 {
    public static void main(String[] args) {
//        System.out.println(10/0);
        System.out.println(-10/0.0);
//        System.out.println(0/0);
//        System.out.println(0.0/0);
    }
}

