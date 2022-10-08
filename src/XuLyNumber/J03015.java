package XuLyNumber;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = null, num2 = null;
        num1 = new BigInteger(sc.next());
        num2 = new BigInteger(sc.next());
        System.out.println(num1.subtract(num2));
    }
}
