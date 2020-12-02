import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {
    private List<Person> people;
    private Person person1;
    private Person person2;

    @Before
    public void setUp(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        people = new ArrayList<>(Arrays.asList(person1, person2));
    }

    @Test
    public void getAgeTest(){
        Person person1 = new Person("ChiChi", LocalDate.of(1973,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(1983, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        int actual = person1.getAge();
        int expected = 47;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPerson(){

    }

    @Test
    public void getName(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        String actual = person2.getName();
        String expected = "Goku";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        person1.setName("GokusWife");
        String actual = person1.getName();
        String expected = "GokusWife";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBirthday(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        LocalDate actual = person2.getBirthday();
        LocalDate expected = LocalDate.of(736,4,16);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthday(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        person1.setBirthday(LocalDate.of(1973,11,5));
        LocalDate actual = person1.getBirthday();
        LocalDate expected = LocalDate.of(1973,11,5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        Person.Sex actual = person2.getGender();
        Person.Sex expected = Person.Sex.MALE;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmailAddress(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        String actual = person1.getEmailAddress();
        String expected = "iamchichi@dragonballz.com";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmailAddress(){
        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        person2.setEmailAddress("iamvegeta@dragonballz.com");
        String actual = person2.getEmailAddress();
        String expected = "iamvegeta@dragonballz.com";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString(){
        Person person1 = new Person("ChiChi", LocalDate.of(1973,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
        String expected = "Person{" +
                "name='" + person1.getName() + '\'' +
                ", birthday=" + person1.getBirthday() +
                ", gender=" + person1.getGender() +
                ", emailAddress='" + person1.getEmailAddress() + '\''+
                '}';
        String actual = person1.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void PrintPersonOlderThanTest(){
        Person.printPersonsOlderThan(people, 50);
    }
    @Test
    public void printPersonsWithinAgeRangeTest(){
        Person.printPersonsWithinAgeRange(people, 30,50);
    }

}
