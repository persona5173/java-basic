package kr.ac.cnu.quiz;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 25..
 */
@Slf4j
public class EqualQuizTest {
    @Test
    public void primative_AND_wrapper_비교() throws Exception {
        int i = 100;
        int j = 100;

        assertThat("PRIMATIVE == 비교", i == j, is(true));

        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);

        assertThat("wrapper == 비교", n1 == n2, is(false));
    }

    @Test
    public void Wrapper_equal_비교() throws Exception {
        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);

        assertThat("wrapper equals 비교", n1.equals(n2), is(true));
    }

    @Test
    public void 객체_equal_비교() throws Exception {
        EqualQuiz q1 = new EqualQuiz(100);
        EqualQuiz q2 = new EqualQuiz(100);

        assertThat("객체 == 비교", q1 == q2, is(false));
        assertThat("객체 equals 비교", q1.equals(q2), is(true));    // TODO EqualsQuiz 를 수정해서 테스트 통과 시키기

        // equals 는 절대로 값이 같다는 보장이 아니다.
    }

    @Test
    public void String_테스트() throws Exception {
        String s1 = "Hello";
        String s2 = "Hello";

        assertThat("String equals", s1.equals(s2), is(true));
        assertThat("String 은 객체인데 s1 == s2가 true 라니!?", s1 == s2, is(true));
    }


    @Test
    public void NewString_비교() throws Exception {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        assertThat("new String == new String => true", s1 == s2, is(false));
    }
}