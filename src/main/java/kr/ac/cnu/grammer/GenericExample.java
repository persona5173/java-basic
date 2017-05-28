package kr.ac.cnu.grammer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class GenericExample {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(int age, String name) {
        personList.add(new Person(age, name));
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public List<Person> findAllByOrderByAgeAsc() {
        return personList
                .stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .collect(Collectors.toList());

    }

    public List findAllByOrderByAgeDesc() {
        personList.sort((o1, o2) -> o2.getAge() - o1.getAge());

        return personList;
    }
}
