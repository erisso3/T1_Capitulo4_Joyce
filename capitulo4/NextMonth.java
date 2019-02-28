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
public class NextMonth {
   private Integer dia;
   private Integer mes;
   private static final Integer ENERO=31;
   private static final Integer FEBRERO=28;
   private static final Integer MARZO=31;
   private static final Integer ABRIL=30;
   private static final Integer MAYO=31;
   private static final Integer JUNIO=30;
   private static final Integer JULIO=31;
   private static final Integer AGOSTO=31;
   private static final Integer SEPTIEMBRE=30;
   private static final Integer OCTUBRE=31;
   private static final Integer NOVIEMBRE=30;
   private static final Integer DICIEMBRE=31;
   

    public NextMonth(Integer dia, Integer mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    public void GregorianCalendar(){
        switch(this.getMes()){
            case 1:
                System.out.println("Dias para proximo mes:"+(ENERO-this.getDia()));
                break;
            case 2:
                System.out.println("Dias para proximo mes:"+(FEBRERO-this.getDia()));
                break;
            case 3:
                System.out.println("Dias para proximo mes:"+(MARZO-this.getDia()));
                break;
            case 4:
                System.out.println("Dias para proximo mes:"+(ABRIL-this.getDia()));
                break;
            case 5:
                System.out.println("Dias para proximo mes:"+(MAYO-this.getDia()));
                break;
            case 6:
                System.out.println("Dias para proximo mes:"+(JUNIO-this.getDia()));
                break;
            case 7:
                System.out.println("Dias para proximo mes:"+(JULIO-this.getDia()));
                break;
            case 8:
                System.out.println("Dias para proximo mes:"+(AGOSTO-this.getDia()));
                break;
            case 9:
                System.out.println("Dias para proximo mes:"+(SEPTIEMBRE-this.getDia()));
                break;
            case 10:
                System.out.println("Dias para proximo mes:"+(OCTUBRE-this.getDia()));
                break;
            case 11:
                System.out.println("Dias para proximo mes:"+(NOVIEMBRE-this.getDia()));
                break;
            case 12:
                System.out.println("Dias para proximo mes:"+(DICIEMBRE-this.getDia()));
                    break;
        }
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }
    
    

}
