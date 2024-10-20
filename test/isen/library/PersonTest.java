package isen.library;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public Person person;

    @BeforeEach
    void Person() {
        person = new Person();
    }
    @org.junit.jupiter.api.Test
    void constructor() {
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }
    @org.junit.jupiter.api.Test
    void setName() {
        person.setName("Barbara");
        assertEquals("Barbara", person.getName());
    }
    @org.junit.jupiter.api.Test
    void setYears() {
        person.setYears(22);
        assertEquals(22, person.getYears());
    }
    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("unknown", person.getName());
    }

    @org.junit.jupiter.api.Test
    void getYears() {
        assertEquals(22, person.getYears());
    }

}
