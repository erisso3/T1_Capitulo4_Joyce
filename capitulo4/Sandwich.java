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
public class Sandwich {
    private Bread Pan;
    private SandwichFilling Relleno;
    
    public Sandwich(float cap,Breadtype pan,fillingtype relleno,float car){
        this.Pan=new Bread(cap, pan);
        this.Relleno=new SandwichFilling(relleno, car);
    }

    public float Calorias(){
        return this.Pan.getCalorias()+this.Relleno.getCalorias();
    }
    public String TestSandwich(){
        return String.format("Sandwich\nPan:%s\nCalorias:%.2f\nRelleno:%s\nCalorias:%.2f\nTotal de calorias:%.2f",this.getPan().getTipo(),this.getPan().getCalorias(),this.Relleno.getRelleno(),this.Relleno.getCalorias(),Calorias());
    }
    
    /**
     * @return the Pan
     */
    public Bread getPan() {
        return Pan;
    }

    /**
     * @param Pan the Pan to set
     */
    public void setPan(Bread Pan) {
        this.Pan = Pan;
    }

    /**
     * @return the Relleno
     */
    public SandwichFilling getRelleno() {
        return Relleno;
    }

    /**
     * @param Relleno the Relleno to set
     */
    public void setRelleno(SandwichFilling Relleno) {
        this.Relleno = Relleno;
    }
    
    
}
