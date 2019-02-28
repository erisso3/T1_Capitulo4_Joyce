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
public class Paciente {
    private Integer id;
    private Integer age;
    private BloodDate bd;
    public Paciente(){
        this.id=0;
        this.age=0;
        this.bd=new BloodDate();
    }
    
    public Paciente(Integer id,Integer age,BloodType type,Factor factor){
        this.id=id;
        this.age=age;
        this.bd=new BloodDate(type, factor);
    }
    
    public String toString(){
        return String.format("ID:%d\nEdad:%d\nTS:%s\nFactor:%s",this.getId(),this.getAge(),this.bd.getBloodType(),this.bd.getFactor());
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the bd
     */
    public BloodDate getBd() {
        return bd;
    }

    /**
     * @param bd the bd to set
     */
    public void setBd(BloodDate bd) {
        this.bd = bd;
    }
    
}
