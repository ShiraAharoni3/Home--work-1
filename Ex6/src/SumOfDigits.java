import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int digit = 0;
        int sum = 0;
        System.out.println(" Please enter a number :");
        number = scanner.nextInt();

        while (number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
            System.out.println(" The number's digits sum is : " + sum);

        }
    }
