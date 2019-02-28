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
public class State {
    private Estados Estados;
    private Integer Poblacion;
    private String Capital;
    private String Poular;
    private City City;

    public State(Estados Estados, Integer Poblacion, String Capital, String Poular, String nombre,Integer numero) {
        this.Estados = Estados;
        this.Poblacion = Poblacion;
        this.Capital = Capital;
        this.Poular = Poular;
        this.City=new City(nombre, numero);
    }

    
    public String TestState(){
        return String.format("Estado:%s\nPoblacion E:%d\nCapital:%s\nCuidad P:%s\nCuidad:%s\nPoblacion C:%d",this.Estados,this.getPoblacion(),this.getCapital(),this.getPoular(),this.getCity().getNombre(),this.getCity().getNumero());
    }
    public Estados getEstados() {
        return Estados;
    }

    public void setEstados(Estados Estados) {
        this.Estados = Estados;
    }

    public Integer getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(Integer Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public String getPoular() {
        return Poular;
    }

    public void setPoular(String Poular) {
        this.Poular = Poular;
    }

    public City getCity() {
        return City;
    }

    public void setCity(City City) {
        this.City = City;
    }
    
    
    
    
    
}
