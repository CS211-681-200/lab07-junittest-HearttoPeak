package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;

import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    private StudentList studentlist;
    @BeforeEach
    void init() {

        studentlist = new StudentList();
    }
    @Test
    @DisplayName("เพิ่มนักเรียนใหม่่")
    void testAddNewStudent() {
        studentlist.addNewStudent("6710451518","RealPeak",99);
        assertEquals(1,studentlist.getStudents().size());

        studentlist.addNewStudent("6510352234   ","Naigel");
        assertEquals(2,studentlist.getStudents().size());

        studentlist.addNewStudent("9910451111","Demonking",20);
        assertEquals(3,studentlist.getStudents().size());
        studentlist.addNewStudent("6710457777","Muahaha");
        assertEquals(4,studentlist.getStudents().size());
        studentlist.addNewStudent("6910453333   ","Nujo");
        assertEquals(5,studentlist.getStudents().size());
    }
    @Test
    @DisplayName("หานักเรียนโดยใช้้ ID")
    void testFindStudentById() {
        studentlist.addNewStudent("6710451518","RealPeak");
        assertEquals(0,studentlist.findStudentById("6710451518").getScore());
        studentlist.addNewStudent("6510352234   ","Naigel");
        assertEquals(0,studentlist.findStudentById("6710451518").getScore());
        studentlist.addNewStudent("9910453333   ","Demonking");
        assertEquals(0,studentlist.findStudentById("6710451518").getScore());
        studentlist.addNewStudent("6710457777","Muahaha");
        assertEquals(0,studentlist.findStudentById("6710457777").getScore());
        studentlist.addNewStudent("6910453333   ","Nujo");
        assertEquals(0,studentlist.findStudentById("6710457777").getScore());
    }


    @Test
    @DisplayName("หาตามโดยใช้ชื่อ")
    void testFindStudentByName() {
        studentlist.addNewStudent("6710451518","RealPeak",99);
        assertSame(1,studentlist.filterByName("RealPeak").getStudents().size());
        studentlist.addNewStudent("6510352234   ","Naigel");
        assertSame(1,studentlist.filterByName("Naigel").getStudents().size());
        studentlist.addNewStudent("6710457777","Muahaha");
        assertSame(1,studentlist.filterByName("Muahaha").getStudents().size());
        studentlist.addNewStudent("6910453333   ","Nujo");
        assertSame(1,studentlist.filterByName("Nujo").getStudents().size());
        studentlist.addNewStudent("6710457777","Muahaha");
        assertSame(1,studentlist.filterByName("Muahaha").getStudents().size());
        studentlist.addNewStudent("9910453333   ","Demonking");
        assertSame(1,studentlist.filterByName("Demonking").getStudents().size());
    }
    @Test
    @DisplayName("ให้คะแนน")
    void testGiveScoreToId(){
        studentlist.addNewStudent("6710451518","RealPeak");
        studentlist.giveScoreToId("6710451518",50);
        assertEquals(50,studentlist.findStudentById("6710451518").getScore());
        studentlist.addNewStudent("6510352234   ","Naigel");
        studentlist.giveScoreToId("6510352234",100);
        assertEquals(100,studentlist.findStudentById("6510352234").getScore());

        studentlist.addNewStudent("6710457777","Muahaha");
        studentlist.giveScoreToId("6710457777",75);
        assertEquals(75,studentlist.findStudentById("6710457777").getScore());

        studentlist.addNewStudent("6910453333   ","Nujo");
        studentlist.giveScoreToId("6910453333",40);
        assertEquals(40,studentlist.findStudentById("6910453333").getScore());

        studentlist.addNewStudent("9910453333","Demonking");
        studentlist.giveScoreToId("9910453333",0);
        assertEquals(0,studentlist.findStudentById("9910453333").getScore());

    }
    @Test
    @DisplayName("ดูเกรด")
    void testViewGradeOfId(){
        studentlist.addNewStudent("6710451518","RealPeak",0);
        studentlist.viewGradeOfId("6710451518");
        assertEquals("F",studentlist.findStudentById("6710451518").getGrade());
        studentlist.addNewStudent("6510352234   ","Naigel",55);
        studentlist.viewGradeOfId("6510352234");
        assertEquals("D",studentlist.findStudentById("6510352234").getGrade());

        studentlist.addNewStudent("6710457777","Muahaha",60);
        studentlist.viewGradeOfId("6710457777");
        assertEquals("C",studentlist.findStudentById("6710457777").getGrade());

        studentlist.addNewStudent("6910453333   ","Nujo",70);
        studentlist.viewGradeOfId("6910453333");
        assertEquals("B",studentlist.findStudentById("6910453333").getGrade());

        studentlist.addNewStudent("9910453333","Demonking",80);
        studentlist.viewGradeOfId("9910453333");
        assertEquals("A",studentlist.findStudentById("9910453333").getGrade());
    }

}
