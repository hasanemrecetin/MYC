package com.hasanemrecetin.myc;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args){

        logger.info("Entering application.");
                
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen markayı girin:");
        
        String brandName = scanner.nextLine();
        
        Brand brand = new Brand(brandName);
	
        System.out.println("Marka: " + brandName);
        
        System.out.println("Lütfen modeli girin:");
        
        String modelName = scanner.nextLine();
	        
        Model model = new Model(modelName);
               
        System.out.println("Model: " + modelName);
        
        System.out.println("Lütfen beygir gücünü girin:");
        
        int hpCount = 0;
        
        if(scanner.hasNextInt()){
                hpCount = scanner.nextInt();
        }
        else{
            System.out.println("Lütfen sayi giriniz..!");
        }           
        
        HP hp = new HP(hpCount);
        
        System.out.println("Beygir gücü: " + hpCount);
        
        Car car = new Car(brand,model,hp);
               
        logger.info(car.toString());
}
}
