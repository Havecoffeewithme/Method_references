import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class People
{
    public static void main(String[] args)
    {
        List<Person> people ;
        people = new ArrayList<>();

        people.add(new Person("Lee", "xoro", 1988));
        people.add(new Person("monna", "kgomo", 1988));
        people.add(new Person("land", "steal", 1988));
        people.add(new Person("tom", "drinkwater", 1988));


        doConditionalStuff(people, p ->true, System.out::println);


    }


    private static void doConditionalStuff(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){

        for(Person peeps : people)
        {
            if(predicate.test(peeps))
            {
                consumer.accept(peeps);
            }
        }
    }


    public static class Person
    {
        private final String firstName;
        private final String lastName;
        private final int yearBorn;

        /**
         * Constructor
         * @param firstName : the first name of the individual.
         * @param lastName : the last name of the individual.
         * @param yearBorn : the year born of the individual.
         */
        public Person(final String firstName
                ,final String lastName, final int yearBorn)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.yearBorn = yearBorn;
        }

        @Override
        public String toString() {
            return "firstname : " + firstName + " lastName :" + lastName + " - yearBorn :" + yearBorn ;
        }
    }





}
