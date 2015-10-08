/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.shrek.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bruno
 */
public class Target implements Serializable{

    public Target() {
    }
    private String name;
    private double horizontalPosition;
    private double verticalPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHorizontalPosition() {
        return horizontalPosition;
    }

    public void setHorizontalPosition(double horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    public double getVerticalPosition() {
        return verticalPosition;
    }

    public void setVerticalPosition(double verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    @Override
    public String toString() {
        return "Target{" + "name=" + name + ", horizontalPosition=" + horizontalPosition + ", verticalPosition=" + verticalPosition + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.horizontalPosition) ^ (Double.doubleToLongBits(this.horizontalPosition) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.verticalPosition) ^ (Double.doubleToLongBits(this.verticalPosition) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Target other = (Target) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.horizontalPosition) != Double.doubleToLongBits(other.horizontalPosition)) {
            return false;
        }
        if (Double.doubleToLongBits(this.verticalPosition) != Double.doubleToLongBits(other.verticalPosition)) {
            return false;
        }
        return true;
    }
    
}
