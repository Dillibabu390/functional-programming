import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Topic_BiConsumer {
    public static void main(String[] args) {
        greetingsCustomer.accept(new Customer("maria","23353646"),false);
    }

    static BiConsumer<Customer,Boolean> greetingsCustomer = (customer, hide) ->
            System.out.println("customer name:"+customer.name + "and the number:"+ (hide ? customer.number:"****"));

    static class Customer{
        private String name;
        private String number;

        public Customer(String name, String number) {
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
}
