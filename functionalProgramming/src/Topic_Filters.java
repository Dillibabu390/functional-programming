import java.util.List;
import java.util.stream.Collectors;

public class Topic_Filters {
    public static void main(String[] args) {
        List<People> peoples = List.of(
                new People("Dilli", Gender.MALE),
                new People("Babu", Gender.MALE),
                new People("anu", Gender.FEMALE),
                new People("kalai", Gender.FEMALE),
                new People("keerthi", Gender.FEMALE),
                new People("naveen", Gender.MALE)
        );

        peoples.stream().filter(people -> Gender.FEMALE.equals(people.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


   /*   List<People> female = peoples
              .stream()
              .filter(people -> Gender.FEMALE.equals(people.gender))
              .collect(Collectors.toList());

       female.forEach(System.out::println);*/

    /*  for (People f :female){
          System.out.println(f);
      }*/



      /*  peoples.stream()
                .filter(people -> Gender.FEMALE.equals(people.gender))
                .collect(Collectors.toList())
                .forEach(value -> gett(value.name));*/


    }

    static class People {
        private String name;
        private Gender gender;

        public People(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    static enum Gender {
        MALE,
        FEMALE;

    }

    public static void gett(String value) {
        System.out.println(value);
    }

}
