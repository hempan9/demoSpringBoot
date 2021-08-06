package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lap1")
public class laptops {
    private int lid;
    private String brand;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "laptops{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }
    public void compile(){
        System.out.println("compiling..!");
    }
}
