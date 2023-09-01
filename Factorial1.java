import java.util.Scanner;
// Factorial using recursion //
class Factorial1
{
    public static int factorial(int n)
    {
        if(n == 1)
         return 1;
        else 
         return n * (n-1);
    }
       public static void main (String[] args)
       {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int N = scanner.nextInt();
          int result = factorial(N);
          System.out.println("Factorial of "+N+" is ");
          System.out.println(result);
          scanner.close();
       }
}