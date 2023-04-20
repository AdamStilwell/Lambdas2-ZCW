import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {
    @Test
    public void personCheckerTest(){
        ArrayList<Person> people = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Person p = new Person("Henry", null, 90, Sex.MALE, "madeInHell8@gmail.com");
        Person p2 = new Person("Filson", null, 102, Sex.MALE, "madeInHelk13@aol.com");
        Person p3 = new Person("Utopina", null, 103, Sex.FEMALE, "madeInHeaven@gmail.com");
        people.add(p);
        people.add(p2);
        people.add(p3);

        String expected = sb.append(p)
                .append("\n")
                .append(p2)
                .append("\n")
                .toString();

        String actual = PersonService.printPersons(people, new PersonChecker());

        Assert.assertEquals(expected, actual);

    }
}
