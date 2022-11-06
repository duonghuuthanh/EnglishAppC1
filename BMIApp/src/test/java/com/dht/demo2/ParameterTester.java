/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo2;

import com.dht.service.MyPower;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvFileSource;


/**
 *
 * @author admin
 */
public class ParameterTester {
    @ParameterizedTest
    @CsvSource({"2,3,8", "-2,4,16", "-2,3,-8", "2,0,1"})
    public void testPositivePower(int x, int n, int expected) {
        int actual = MyPower.power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 143, -7})
    public void testPrime(int n) {
        boolean re = MyPower.prime(n);
        Assertions.assertFalse(re);
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "datatest.csv", numLinesToSkip = 1)
    public void testFile(int x, int n, int expected) {
        int actual = MyPower.power(x, n);
        Assertions.assertEquals(expected, actual);
    }
}
