/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolstation;

/**
 *
 * @author x18111238
 */
public class Cars {
    
    String type;
    String regnumber;

    public Cars(String type, String regnumber) {
        this.type = type;
        this.regnumber = regnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegnumber() {
        return regnumber; 
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }


 
    
}
