package kr.ac.cnu.grammer;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class GenericExampleTest {
    private GenericExample genericExample;

    @Before
    public void setUp() throws Exception {
        genericExample = new GenericExample();
        genericExample.addPerson(1, "Mina");
        genericExample.addPerson(35, "Robin");
        genericExample.addPerson(31, "Ian");
    }

    @Test
    public void 오름차순_테스트() {
        List<Person> personList = genericExample.findAllByOrderByAgeAsc();

        Person base = null;
        for (Person person : personList) {
            if (base == null) {
                base = person;
                continue;
            }

            assertTrue(person.getAge() > base.getAge());
            base = person;
        }
    }

    @Test
    public void 내림차순_테스트() {
    }

}