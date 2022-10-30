/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.service.MyPower;
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class DemoTestCase {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
    }
    
    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
    }
    
    @BeforeEach
    public void beforeEach() {
        System.out.println("AFTER EACH");
    }
    
    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
    }
    
    @Test
    @DisplayName("Test mũ dương")
    public void test01() {
        System.out.println("TEST CASE 01");
        int x = 2;
        int n = 2;
        int expected = 4;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    @Tag("critical")
    public void test02() {
        System.out.println("TEST CASE 02");
        int x = 2;
        int n = 5;
        int expected = 32;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    @Tag("critical")
    @DisplayName("Test mũ là 0")
    public void test03() {
        System.out.println("TEST CASE 03");
        int x = 2;
        int n = 0;
        int expected = 1;
        int actual = MyPower.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void test04() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyPower.power(10, -200);
        });
    }
    
    @Test
    public void test05() {
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
            MyPower.power(10, 3);
        });
    }
}
