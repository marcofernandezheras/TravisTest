package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marco on 19/09/15.
 */
public class StudentTest {

    @Test
    public void testGetName() throws Exception {
        String name = "Marco";
        String surname = "Fernandez";
        Student s = new Student(name, surname);
        assertEquals(name,s.getName());
    }

    @Test
    public void testSetName() throws Exception {
        String name = "Marco";
        Student s = new Student("", "");
        s.setName(name);
        assertEquals(name, s.getName());
    }

    @Test
    public void testGetSurname() throws Exception {
        String name = "Marco";
        String surname = "Fernandez";
        Student s = new Student(name, surname);
        assertEquals(surname,s.getSurname());
    }

    @Test
    public void testSetSurname() throws Exception {
        String surname = "Fernandez";
        Student s = new Student("", "");
        s.setSurname(surname);
        assertEquals(surname,s.getSurname());
    }
}