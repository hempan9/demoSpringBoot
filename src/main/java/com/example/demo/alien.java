package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class alien {
    public com.example.demo.laptops getLaptops() {
        return laptops;
    }

    public void setLaptops(com.example.demo.laptops laptops) {
        this.laptops = laptops;
    }
@Autowired
@Qualifier("lap1")
    private laptops laptops;
    public alien() {
        System.out.println("object created");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    private int aid;
    private String aname;
    private String atech;
public void show(){
    System.out.println("in show");
    laptops.compile();

}
}
