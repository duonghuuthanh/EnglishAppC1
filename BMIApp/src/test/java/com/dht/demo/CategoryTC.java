/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demo;

import com.dht.service.CategoryService;
import com.dht.service.JdbcUtils;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class CategoryTC {
    @Test
    public void testCate() {
        try {
            CategoryService.getCategories();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryTC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryTC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    
}
