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
public class Bread {
    private float Calorias;
    private Breadtype Tipo;
    
    public Bread(float calorias,Breadtype tipo){
        this.Calorias=calorias;
        this.Tipo=tipo;
    }

    public static String MOTTO(){
        return "The staff of life";
    }   
    
    public String TestBread(){
        return String.format("Tipo de pan:%s\nCalorias:%.2f\n%s\n",this.getTipo(),this.getCalorias(),MOTTO());
    }
    /**
     * @return the Calorias
     */
    public float getCalorias() {
        return Calorias;
    }

    /**
     * @param Calorias the Calorias to set
     */
    public void setCalorias(float Calorias) {
        this.Calorias = Calorias;
    }

    /**
     * @return the Tipo
     */
    public Breadtype getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(Breadtype Tipo) {
        this.Tipo = Tipo;
    }

    
}
