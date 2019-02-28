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
public class Circle {
    private float Radio;
    private float Diametro;
    private float Area;
    
    public Circle(){
        this.Radio=1;
    }

    public float Diametro(){
        return Diametro=(float)this.getRadio()*2;
    }
    
    public float Area(){
        return Area=(float) ((Math.pow(this.getRadio(),2))*Math.PI);
    }
    
    
    /**
     * @return the Radio
     */
    public float getRadio() {
        return Radio;
    }

    /**
     * @param Radio the Radio to set
     */
    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    /**
     * @return the Diametro
     */
    public float getDiametro() {
        return Diametro;
    }

    /**
     * @param Diametro the Diametro to set
     */
    public void setDiametro(float Diametro) {
        this.Diametro = Diametro;
    }

    /**
     * @return the Area
     */
    public float getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(float Area) {
        this.Area = Area;
    }
    
    
}
