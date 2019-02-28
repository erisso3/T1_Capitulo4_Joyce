/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4;

/**
 *
 * @author eriss
 */
public class BloodDate {
    private BloodType bloodType;
    private Factor factor;
    public BloodDate(){
        this.bloodType=bloodType.O;
        this.factor=factor.POSITIVO;
    }
    
    public BloodDate(BloodType bloodType,Factor factor){
        this.bloodType=bloodType;
        this.factor=factor;
    }

    /**
     * @return the bloodType
     */
    public BloodType getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the factor
     */
    public Factor getFactor() {
        return factor;
    }

    /**
     * @param factor the factor to set
     */
    public void setFactor(Factor factor) {
        this.factor = factor;
    }
}
