import java.util.Scanner ;
import java.lang.Math ;


public class fibonachi {
    public static int  printFibonachi( int n )
    {
        int a1  = 0 ;
        int a2  = 1 ;
        int tmp = 0 ;
        if( n == 1 )
        {
            //System.out.printf(" %d ", a1);
            return 0;
        }
        if( n == 2 )
        {
            //System.out.printf(" %d ", a2);
            return 0;
        }

        //System.out.printf(" %d ", a1);
        //System.out.printf(" %d ", a2);

        for( int i = 2 ; i < n ; i++ )
        {
            //System.out.printf(" %d ", a1 + a2);
            tmp = a1 ;
            a1 = a2 ;
            a2 = a2+tmp ;
        }

        return 0 ;
    }

    public static boolean CheckFibonachi( int number )
    {
        int a1 = 0;
        int a2 = 1;
        int an = 0;
        int tmp = a1;

        while (an < number)
        {
            an = a1 + a2;
            tmp = a1;
            a1 = a2;
            a2 = a2 + tmp;

            //System.out.printf(" an %d val %d \n", an  , number );

        }
        System.out.printf("the number %d ", number );
        if (an == number)
        {
            System.out.printf("is Fibonachi Number\n");
            return true;
        } else
        {
            System.out.printf("is not Fibonachi Number\n" );
            return false;
        }

    }


    public static void main(String[] args)
    {
//        printFibonachi( 6 );
        Scanner scanner = new Scanner( System.in);
        int number = 0 ;


        while( number != -1 )
        {
            System.out.printf("Please enter number : ");
            number = scanner.nextInt();

            CheckFibonachi(number);
        }
    }


}
