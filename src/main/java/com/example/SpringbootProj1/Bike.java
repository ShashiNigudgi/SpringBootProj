package com.example.SpringbootProj1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Bike {
    private int bikenumber ;
    private String bikename;

    public int getBikenumber() {
        return bikenumber;
    }

    public String getBikename() {
        return bikename;
    }

    public void setBikenumber(int bikenumber) {
        this.bikenumber = bikenumber;
    }

    public void setBikename(String bikename) {
        this.bikename = bikename;
    }

    public  void ridethebike(){
        System.out.println("Riding the bike...");
    }

    @RequestMapping
    public String ggetbikedetails ()
    {
        return "Bike Number : " + bikenumber + " & Bike Name : " + bikename;
    }
}
