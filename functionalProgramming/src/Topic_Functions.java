import java.util.function.Function;

public class Topic_Functions {
    public static void main(String[] args) {
        int increment = integerIntegerFunction.apply(1);

        int multi = multiplyBy10function.apply(increment);

        System.out.println(multi);
        System.out.println(increment);

        Function<Integer,Integer> addBy1andMulBy10 = integerIntegerFunction.andThen(multiplyBy10function);

       int both = addBy1andMulBy10.apply(2);
        System.out.println(both);
    }

    static Function<Integer,Integer> integerIntegerFunction = number -> number +1;

    static Function<Integer,Integer> multiplyBy10function = number -> number * 10;
}
