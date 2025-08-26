package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    StudentList s1,s2,s3,s4,s5;
    @BeforeEach
    void init() {
        this.s1 = new StudentList();
        // idk what im doing
        s1 = new StudentList("6710456666","Raboy");
        s2 = new StudentList("6710452222","Nong");
        s3 = new StudentList("6710454444","Amc");
        s4 = new StudentList("6710459999","Cojohn");
        s5 = new StudentList("7010457777","NongNong");
    }
    @Test
    @DisplayName("addnewstudent")
    void testAddNewStudent() {
        s1.addNewStudent("6710459999","Racha",50);
        assertEquals(1,s1.getStudents().size());
        s1.addNewStudent("6610402222   ","Nongkai");
        assertEquals(2,s1.getStudents().size());


    }
    @Test
    @DisplayName("หาชื่อโดยใช้โดยID")

    // Im here so confuse
    void testGetStudentID() {
        s1.findStudentById("6710451518");
        assertEquals("6710451518", s1.findStudentById("6710451518"));
    }

}
