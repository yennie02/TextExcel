package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Setting up");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("tear down!");
    }

    @org.junit.jupiter.api.Test
    void add() {
        int sum = Main.Add(3, 4);
        assertEquals(7, sum);
    }

    @org.junit.jupiter.api.Test
    void add_invalid() {
        int sum = Main.Add(4, 4);
        assertEquals(7, sum);
    }
}