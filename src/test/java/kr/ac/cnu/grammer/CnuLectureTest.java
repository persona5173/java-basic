package kr.ac.cnu.grammer;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 26..
 */
public class CnuLectureTest {
    private static Teacher T1 = new Teacher("Robin", 10);
    private static Teacher T2 = new Teacher("Tony", 8);
    private static Teacher T3 = new Teacher("David", 13);
    private static Teacher T4 = new Teacher("Sam", 17);

    private CnuLecture cnuLecture;

    @Before
    public void setUp() throws Exception {
        cnuLecture = new CnuLecture();


        cnuLecture.addTeacher(T1);
        cnuLecture.addTeacher(T2);
        cnuLecture.addTeacher(T3);
        cnuLecture.addTeacher(T4);
    }

    @Test
    public void Call_By_Reference_확인() {
        Teacher teacher = cnuLecture.getTeacher("Robin");
        assertTrue(teacher.getPoint() == 10);

        teacher.setPoint(20);
    }

    @Test
    public void Call_By_Reference_확인2() {
        Teacher teacher = cnuLecture.getTeacher("Robin");
        assertTrue(teacher.getPoint() == 10);
    }

}