package Demo;
// Arithmetic operation always return max type
// max(int, type of firstValue, type of secondValue)
/**
 *  byte + byte = int
 *  byte + short = int
 *  short + short = int
 *  byte + long = long
 *  long + double = double
 *  float + long = float
 *  char + char = int
 * char + double = double
 * */
public class ArithmeticDoubt {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c =(byte)(a+b);
        System.out.println(c);
        System.out.println('a'+'c');
        System.out.println('a'+0.95);
    }
}

