package kr.ac.cnu.grammer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class GenericExample {
    // TODO 테스트 코드 만들기
    public List<Person> getPersonList(int age, String name) {
        List<Person> personList = new ArrayList();
        personList.add(new Person(age, name));

        return personList;
    }

    public List getPersonList2(int age, String name) {
        List<Person> personList = new ArrayList();
        personList.add(new Person(age, name));

        return personList;
    }
}
