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
public class SandwichFilling {
    private fillingtype Relleno;
    private float Calorias;
    
    public SandwichFilling(fillingtype relleno,float calorias){
        this.Calorias=calorias;
        this.Relleno=relleno;
    }

    public String TestSandwichFilling(){
        return String.format("Relleno:%s\nCalorias:%.2f\n",this.getRelleno(),this.getCalorias());
    }
    /**
     * @return the Relleno
     */
    public fillingtype getRelleno() {
        return Relleno;
    }

    /**
     * @param Relleno the Relleno to set
     */
    public void setRelleno(fillingtype Relleno) {
        this.Relleno = Relleno;
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

}
