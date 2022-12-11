public class NarcisistsNumber
    {
        public static void main(String[] args)
        {
            int number = 0;
            int numOfDigitInNumber = 0 ;

            for ( number = 1 ; number < 1000 ; number++ )
            {
                numOfDigitInNumber = numOfDigits( number );
                //System.out.printf("Number %d has Number %d digits \n" , number ,  numOfDigitInNumber);
                DigitsInNumber( number );
                IsNumberNarcisists( number );
            }

        }

        public static int numOfDigits(int number)
        {
            int count = 0, num = number ;

            while (num  > 0) {
                num= num / 10;
                ++count;
            }

            return count;
        }

        public static int DigitsInNumber(int number)
        {
            int count = 0, num = number ;

            //System.out.printf("Number %d ----- " , number );
            while (num  > 0)
            {
                int most_right_digit = num % 10  ;
                //System.out.printf(" %d  " , most_right_digit );
                num= num / 10;
            }
            //System.out.println();
            return 0 ;
        }

        public static boolean IsNumberNarcisists(int number)
        {
            int  digitArray [] = new int[5];
            int digit_index = 0 ;
            int digit_counter = 0 ;
            int sum = 0 ;
            int num = number ;
            boolean res  = true ;

            //System.out.printf("Number %d ----- \n" , num );
            int most_right_digit = 0  ;
            while (num  > 0)
            {
                most_right_digit = num % 10  ;
                //System.out.printf(" %d  " , most_right_digit );
                digitArray[digit_index++] = most_right_digit ;
                num = num / 10;
                digit_counter++ ;
            }
            for( int i = 0 ; i < digit_counter ; i++ )
            {
               int dig_value = 1;
               for ( int j = 0 ; j < digit_counter ; j++)
               {
                   dig_value = dig_value * digitArray[i];
                   //System.out.printf( " %d " , dig_value);
               }
                //System.out.println();
                sum = sum + dig_value;
                //System.out.printf( " %d  \n " , sum);

            }

            if( sum == number )
            {
                System.out.printf("number %d is narcisist \n" , number);
                return true ;
            }
            else
            {
                //System.out.printf( "number %d is not narcisist \n" ,number);
                return false  ;
            }
        }

    }


