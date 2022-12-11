import java.util.Scanner;

public class PrimNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println(" Please enter number :");
        number = scanner.nextInt();
        int counter = 0;
        if (number >= 1)
        {
            System.out.println("1");
            if (number >= 2)
            {
                System.out.println("2");

                if (number >= 3) {
                    counter = 2;
                    int num = 3;
                    while (counter < number) {
                        if (isPrimNumber(num) == 1) {
                            System.out.println(num);
                            counter++;
                        }
                        num++;
                    }
                }
            }
        }
    }
    public static int isPrimNumber( int val )
    {
        int res = 1 ;
        for (int i = 2; i < val; i++)
        {
            if( val % i == 0 )
            {
                res = 0;
                break;
            }
        }
        return res ;
    }

}