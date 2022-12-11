import java.util.Scanner ;
import java.lang.Math;

public class ExSqrt {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in);
        float paraA = 0;
        float paraB = 0;
        float paraC = 0;

        System.out.println( "Enter 3 parameters of square root equation :");
        System.out.println( "please enter parameter A :");
        paraA = scanner.nextFloat();
        System.out.println( "please enter parameter B :");
        paraB = scanner.nextFloat();
        System.out.println( "please enter parameter C :");
        paraC = scanner.nextFloat();

        System.out.printf( "you had entered  A : %f B : %f C :%f \n" , paraA , paraB , paraC );
        float bNeg= -paraB;

        float des= ((paraB*paraB) + (-4*paraA*paraC));
        if ( des < 0 )
        {
            System.out.printf("Error : des is negative %f \n", des);
            return  ;
        }

        float sum= (float)Math.sqrt(des);


        System.out.printf( "The sum = %f \n" , sum);

        float x1= ( (bNeg + sum) / 2* paraA);
        float x2= ( (bNeg - sum) / 2* paraA);

        System.out.printf( "The result 1 is = %f \n" , x1);
        System.out.printf( "The result 2 is = %f \n" , x2);


    }
}