import java.util.List;

public class StandardProgramOne {
    public static void main(String[] args) {
        listOfnumbers(List.of(55,53,87,34,12,43,65,98));
    }

    private static void listOfnumbers(List<Integer> numbers) {
        for (int number : numbers)
        {
            System.out.println(number);
        }
    }
}
