package com.hasanemrecetin.myc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brand {    
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    private String BrandName;
    
    public Brand(String Name) {
        this.BrandName = Name;
        logger.info("Brand created with: " + this.BrandName);
    }

    public String getBrandName() {
        return BrandName;
    }
       
}
