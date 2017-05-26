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
    private static CnuLecture cnuLecture;

    @BeforeClass
    public static void setUp() throws Exception {
        cnuLecture = new CnuLecture();

        Teacher teacher1 = new Teacher("Robin", 10);
        Teacher teacher2 = new Teacher("Tony", 8);
        Teacher teacher3 = new Teacher("David", 13);
        Teacher teacher4 = new Teacher("Sam", 17);

        cnuLecture.addTeacher(teacher1);
        cnuLecture.addTeacher(teacher2);
        cnuLecture.addTeacher(teacher3);
        cnuLecture.addTeacher(teacher4);
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