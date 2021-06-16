public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor){
        if(divisor == 0 || dividend == 0){
            return 0;
        }


        int count = 0;
        int result = 0;
        int checkCounter = 0;

        if(dividend < 0 && divisor < 0){
            while (count > dividend){
                count += divisor;
                result++;
            }



        }
        else if(dividend < 0){
            while (count > dividend){
                count -= divisor;
                result--;
            }
        }
        else if(divisor < 0){
            while (count < dividend){
                count -= divisor;
                result--;
            }
            for(int i = 0; i < result; i++){
                checkCounter =+ Math.abs(divisor);

            }
            if(checkCounter < count){
                return result + 1;
            }
        }
        else{
            while(count < dividend){
                count += divisor;
                result++;
            }
            for(int i = 0; i < result; i++){
                checkCounter =+ Math.abs(divisor);

            }
            if(checkCounter < count){
                return result - 1;
            }

        }




        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide(888, -120));
    }
}
