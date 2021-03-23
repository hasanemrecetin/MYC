
package com.hasanemrecetin.myc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HP {
    
    private static final Logger logger = LoggerFactory.getLogger(Model.class);
    
    private int hp;

    public HP(int HP) {
        this.hp = HP;
        logger.info("HP created with: " + this.hp);
    }   

    public int getHp() {
        return this.hp;
    }
    
    
}
