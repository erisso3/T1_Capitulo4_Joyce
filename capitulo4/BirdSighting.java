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
public class BirdSighting {
    private String Datos;
    private Integer Naves;
    private Integer dia;
    
    public BirdSighting(){
        this.Datos="Robi";
        this.dia=1;
        this.Naves=3;
    }
    
    public BirdSighting(String datos,Integer naves,Integer dia){
        this.Datos=datos;
        this.Naves=naves;
        this.dia=dia;
    }
    
    public String TestBirdSighting(){
        return String.format("Especie:%s\nNum.Aves:%d\nDia:%d ",this.getDatos(),this.getNaves(),this.getDia());
    }

    /**
     * @return the Datos
     */
    public String getDatos() {
        return Datos;
    }

    /**
     * @param Datos the Datos to set
     */
    public void setDatos(String Datos) {
        this.Datos = Datos;
    }

    /**
     * @return the Naves
     */
    public Integer getNaves() {
        return Naves;
    }

    /**
     * @param Naves the Naves to set
     */
    public void setNaves(Integer Naves) {
        this.Naves = Naves;
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    
    
}
