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
public class Billing {
    private static float IMP;

    
    public Billing(){
        IMP=(float)0.8;
    }

    public float computeBill(Integer vp){
        return vp+(vp*IMP);
    }
    
    public float computeBill(Integer vp,Integer ca){
        return (vp*ca)+((vp*ca)*IMP);
    }
    
    public float computeBill(Integer vp,Integer ca,Integer vc){
        return ((vp*ca)-vc)+IMP*((vp*ca)-vc);
    }
    /**
     * @return the IMP
     */
    public static float getIMP() {
        return IMP;
    }

    /**
     * @param aIMP the IMP to set
     */
    public static void setIMP(float aIMP) {
        IMP = aIMP;
    }
    
                
}
