import java.util.Scanner;

public class arithmeticProgression {
    public static void main(String[] args) {

        Scanner scanner= new Scanner( System.in);

        float A1 = 0;
        float d = 0;
        int n = 0;

        System.out.println( " Enter 3 numbers : " );
        System.out.println( " First part of the arithmetic progression : ");
        A1 = scanner.nextFloat();
        System.out.println( " The series difference : ");
        d = scanner.nextFloat();
        System.out.println( " The number of members of the progression : ");
        n = scanner.nextInt();

        for ( int i = 1 ; i <= n ;  i++ )
        {
            float An = 0 ;
            System.out.printf( " %d  " , i );
            An = A1+(i-1)*d;
            System.out.printf( " %d : %f \n" , i , An);

        }


    }
}