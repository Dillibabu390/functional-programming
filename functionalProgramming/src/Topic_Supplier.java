import java.util.function.Supplier;

public class Topic_Supplier {
    public static void main(String[] args) {

        System.out.println(getValues.get());
    }

    static Supplier<String> getValues = () ->
            "hello world";
}
