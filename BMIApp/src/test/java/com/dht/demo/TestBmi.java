/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;
import com.dht.service.BmiService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author admin
 */
public class TestBmi {
    @Test
    public void test01() {
        BmiService s = new BmiService(1.7, 70);
        Assertions.assertTrue(s.getLabel()==0);
    }
    
    @Test
    public void test02() {
        BmiService s = new BmiService(1.7, 75);
        Assertions.assertTrue(s.getLabel()==1);
    }
}
