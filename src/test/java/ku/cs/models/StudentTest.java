package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeEach
    void init() {
        s = new Student("6710451518","caping");
    }

    // จำเป็นต้องมีถ้าจะเขียน test
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){        // return type void only
        Student s = new Student("6710555555","test");
        s.addScore(40);
        assertEquals(40,s.getScore());     // ห้ามแก้ expected
        s.addScore(0);
        assertEquals(40,s.getScore());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){

        s.addScore(30);
        assertEquals("F",s.grade());
        // cuz obj is static and เป็น Beforeeach ทำให้ obj แยกกันได้
    }
    @Test
    @DisplayName("IDchecker")
    void testIdchecker(){
//        assertSame(true,s.isId("6710451518"));
        assertNotSame(false,s.isId("6710451518"));
    }
    @Test
    @DisplayName("เปลี่ยนชื่อ")
    void testchageName(){
        s.changeName("test");
        assertEquals("test",s.getName());
    }
    @Test
    @DisplayName("ทดสอบกการเปลี่ยนชื่อให้อยู่ใน LowerCase")
    void testchageNameLowerCase(){
        s.getName();
        assertEquals("caping",s.getName());
    }



}