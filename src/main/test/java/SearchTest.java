import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SearchTest {
    SocialNetworks networks = new SocialNetworks();
    Search search = new Search();

//    @Before
//    public void setUp(){
//        Person person1 = new Person("ChiChi", LocalDate.of(737,11,5), Person.Sex.FEMALE, "iamchichi@dragonballz.com");
//        Person person2 = new Person("Goku", LocalDate.of(736, 4, 16), Person.Sex.MALE, "iamgoku@dragonballz.com");
//        Person[] dragonBallZCharacters = {person1, person2};
//        for (int i = 0; i < dragonBallZCharacters.length; i++) {
//
//        }
//        for (int i = 0; i < dragonBallZCharacters.length; i++) {
//            networks.add(dragonBallZCharacters[i]);
//        }
//    }

    @Test
    public void searchTest(){
        Search.printPersons(networks.get(), search);
    }

}
