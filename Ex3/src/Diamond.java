import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do
        {
            System.out.println(" Please enter number : ");
            number = scanner.nextInt();
        }
        while ( number % 2 == 0 || number < 3);
        printDiamond(number);

    }

    public static char printDiamond(int number)
    {
        int noOfSpace = number / 2 ;
        for (int i = 1; i <= number; i++)
        {
            if (i < number / 2 + 1)
            {
                for( int k = 0 ; k <= ( noOfSpace+1 - i ) ; k++ )
                    System.out.printf("  " );
                for (int j = 0; j < 2*i -1; j++)
                {
                    System.out.printf(" *" );
                }
                System.out.println();

            }
            else
            {
                for( int k = 0 ; k <= ( noOfSpace + i - number ) ; k++ )
                    System.out.printf("  " );
                for (int j = 0; j < 2* (number - i) + 1; j++)
                {
                    System.out.printf( " *" );
                }
                System.out.println();
            }
        }
        return 0;
    }
}

