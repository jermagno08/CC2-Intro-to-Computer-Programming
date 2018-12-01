import java.util.*;

public class Fibo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of sequence for Fibonacci");
        int term = sc.nextInt();
        System.out.println("The Fibonacci is " + F(term) + " and number of sequence is " + term);
    }

    public static int F(int n) {
	if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
}
