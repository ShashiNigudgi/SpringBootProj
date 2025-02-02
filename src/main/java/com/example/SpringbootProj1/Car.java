package com.example.SpringbootProj1;

import org.springframework.stereotype.Component;

@Component("carrr")
public class Car {

        private String carName;
        private int carNumber;

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public  void ridethecar(){
            System.out.println("Riding the car");
        }

}
