package kr.ac.cnu.grammer;

import lombok.Data;

/**
 * Created by rokim on 2017. 5. 25..
 */
@Data
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
