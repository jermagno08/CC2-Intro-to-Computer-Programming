import java.util.Scanner;
public class Fibonacci 
{

    public static void main(String[] args) {


    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a term for Fibonacci");
    int term = keyboard.nextInt();
    System.out.println("the term of " + F(term) + " in fibonacci is " + F(term));
    
     }
    public static int F(int n) {
    if (n == 0)  {
        return 0;
    }
    if (n ==1)   {
        return 1;
    }
    else {
        return F(n - 1) + F(n - 2);
     }
   }

}
