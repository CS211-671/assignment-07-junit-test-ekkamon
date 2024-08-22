package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("6610402281", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        student.addScore(45.15);
        assertEquals(45.15, student.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        student.addScore(85);
        assertEquals("A", student.grade());
    }

    @Test
    @DisplayName("Student can change name")
    void testStudentChangeName(){
        student.changeName("StudentNewNameTest");
        assertEquals("StudentNewNameTest", student.getName());
    }
}