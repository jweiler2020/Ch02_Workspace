import java.util.Scanner;

public class Number11
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = kb.nextInt();
        System.out.format("2 * %d = %d", n, n*2);
    }
}
