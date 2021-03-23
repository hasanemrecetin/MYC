
package com.hasanemrecetin.myc;

public class Car {
    Brand brand;
    Model model;
    HP hp;

    public Car(Brand brand, Model model, HP hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand.getBrandName() + ", model=" + model.getModelName() + ", hp=" + hp.getHp() + '}';
    }
        
}
