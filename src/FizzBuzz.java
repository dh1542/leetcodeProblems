import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {


        ArrayList<String> out = new ArrayList();

        if(n <= 0){
            return out;
        }

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                out.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                out.add("Fizz");
            }
            else if(i % 5 == 0){
                out.add("Buzz");
            }
            else{
                out.add(String.valueOf(i));
            }
        }



        return out;
    }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }
}
