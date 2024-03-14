import java.util.List;
public class FunctionalProgramOne {

        public static void main(String[] args) {
            listOfnumbers(List.of(55,53,87,34,12,43,65,98));

            listofString(List.of("babu","dilli","helllo","man"));

            animals(List.of("cat","dog","man","donkey","monkey"));

        }

    private static void print(int i) {
        System.out.println(i);
    }
    private static void listOfnumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(FunctionalProgramOne::isEven)      /* use to print without print method  .forEach(System.out::println);*/
                .forEach(FunctionalProgramOne::print);

    }

    private static void listofString(List<String> names){
       // names.forEach( name -> System.out.println(name));
        names.stream().filter(name -> name.contains("man")).forEach(namess -> System.out.println(namess));

    }

    private static String animals(List<String> animal){
        animal.stream().filter(animals -> animals.contains("monkey")).forEach(animals -> System.out.println(animals));

        return null;
    }


    private static boolean isEven(Integer num) {
            return num%2==0;
    }


}
