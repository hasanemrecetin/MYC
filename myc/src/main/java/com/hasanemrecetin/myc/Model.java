package com.hasanemrecetin.myc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Model {
    
    private static final Logger logger = LoggerFactory.getLogger(Model.class);
    
    private String model;

    public Model(String model) {
        this.model = model;
        logger.info("Model created with: " + this.model);
    } 

    public String getModelName() {
        return this.model;
    }  
    
}
