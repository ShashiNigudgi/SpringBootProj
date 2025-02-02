package com.example.SpringbootProj1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Vehicle {

    private String vname;
    private int vnumber;
    private long vcost;
    @Autowired
    @Qualifier("carrr")
    private Car car;

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    //public Vehicle(){};
@Autowired
//if you want to provide the argumnets to the constructor then you will be giving like this with @value &Autowired,
//this will help you to inject the arguments in the bean.
    //public Vehicle(@Value("venue") String vname, @Value("2424") int vnumber, @Value("1800000") long vcost) {
   /* public Vehicle(String vname, int vnumber, long vcost){
        this.vname = vname;
        this.vnumber = vnumber;
        this.vcost = vcost;
    }*/

    public Vehicle() {
        System.out.println("inside the object ");
    }

    public void test()
    {
        System.out.println("Testing the Vehicle");
        car.ridethecar();


    }
}
