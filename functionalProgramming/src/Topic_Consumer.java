import java.util.function.Consumer;

public class Topic_Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("maria","343434");
        greetingsCustomer.accept(maria);
    }

    static Consumer<Customer> greetingsCustomer = customer ->
            System.out.println("customer name:"+customer.name + "and the number:"+ customer.number);

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
