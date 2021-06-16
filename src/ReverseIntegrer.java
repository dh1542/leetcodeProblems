public class ReverseIntegrer {
    public static int reverserInt(int x){
        if(x >= 2147483647 || x <= -2147483647  ){
            return 0;
        }

        if(x < 0){

             long l = +x;
            System.out.println(l);
            String number = Long.toString(l);

            StringBuilder sb = new StringBuilder(number);
            l= Long.parseLong(sb.reverse().toString());
            if(l > 2147483647){
                return 0;
            }

            return -(int) l;
        }


        String number = Integer.toString(x);


        StringBuilder sb = new StringBuilder(number);


        long l= Long.parseLong(sb.reverse().toString());
        if(l > 2147483647){
            return 0;
        }
        return (int) l;


    }

    public static void main(String[] args) {
        System.out.println(reverserInt(
                -2147483648));
    }

}

