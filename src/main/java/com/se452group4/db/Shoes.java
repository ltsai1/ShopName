/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se452group4.db;

import org.springframework.data.annotation.Id;

/**
 *
 * @author duely
 */
public class Shoes {
    @Id
    public String shoesId;
    public String type;
    public String brandName;
    public Integer price;
    public String gender;
    public Integer quantity;
    
    public Shoes() {}
    
    public Shoes(String shoesId, String type, String brandName, Integer price,
            String gender, Integer quantity) {
        this.shoesId = shoesId;
        this.type = type;
        this.brandName = brandName;
        this.price = price;
        this.gender = gender;
        this.quantity = quantity;
    }
}
