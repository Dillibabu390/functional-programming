import java.util.function.Predicate;

public class Topic_Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberIsValid.test("0334567891442"));
        // isPhoneNumberIsValid.and(otherPredicate).test("input");
        // isPhoneNumberIsValid.or(otherPredicate).test("input");
    }


    static Predicate<String> isPhoneNumberIsValid = phoneNum -> phoneNum.startsWith("03") && phoneNum.length() == 11;
}
