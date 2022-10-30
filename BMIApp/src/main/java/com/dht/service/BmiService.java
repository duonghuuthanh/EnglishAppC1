/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.service;

/**
 *
 * @author admin
 */
public class BmiService {
    private double height, weight;

    public BmiService(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public double tinhBmi() {
        return weight / Math.pow(height, 2);
    }
    
    public int getLabel() {
        if (this.tinhBmi() > 25)
            return 1;
        
        return 0;
    }
}
