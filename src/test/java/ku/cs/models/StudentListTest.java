package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList studentList;

    @BeforeEach
    public void newStudentList() {
        studentList = new StudentList();

        studentList.addNewStudent("6610400001", "Chokun", 80.00);
        studentList.addNewStudent("6610400002", "B", 0.00);
        studentList.addNewStudent("6610400003", "Krit", 0.00);
    }

    @Test
    @DisplayName("Student should be found in StudentList")
    public void testStudentListFindStudent() {
        Student student = studentList.findStudentById("6610400002");

        assertEquals("6610400002", student.getId());
    }

    @Test
    @DisplayName("Student should be receive the score")
    public void testAddScoreToStudent() {
        studentList.giveScoreToId("6610400002", 50.50);

        assertEquals(50.50, studentList.findStudentById("6610400002").getScore());
    }

    @Test
    @DisplayName("Student should be show grade A")
    public void testViewGradeOfStudent() {
        studentList.viewGradeOfId("6610400001");

        assertEquals("A", studentList.findStudentById("6610400001").grade());
    }
}