import java.util.function.BiFunction;

public class Topic_BiFunction {
    public static void main(String[] args) {
        int result = incrementAndMultiply.apply(2,100);
        System.out.println(result);
    }

   static BiFunction<Integer,Integer,Integer> incrementAndMultiply = (increment,multi)
            -> (increment +1) * multi;
}
