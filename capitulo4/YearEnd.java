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
public class YearEnd {
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

    public YearEnd(Integer dia, Integer mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    public void GregorianCalendar(){
        switch(this.getMes()){
            case 1:
                System.out.println("Dias restantes:"+(ENERO-this.getDia()+FEBRERO+MARZO+ABRIL+MAYO+JUNIO+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 2:
                System.out.println("Dias restantes:"+(FEBRERO-this.getDia()+MARZO+ABRIL+MAYO+JUNIO+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 3:
                System.out.println("Dias restantes:"+(MARZO-this.getDia()+ABRIL+MAYO+JUNIO+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 4:
                System.out.println("Dias restantes:"+(ABRIL-this.getDia()+MAYO+JUNIO+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 5:
                System.out.println("Dias restantes:"+(MAYO-this.getDia()+JUNIO+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 6:
                System.out.println("Dias restantes:"+(JUNIO-this.getDia()+JULIO+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 7:
                System.out.println("Dias restantes:"+(JULIO-this.getDia()+AGOSTO+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 8:
                System.out.println("Dias restantes:"+(AGOSTO-this.getDia()+SEPTIEMBRE+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 9:
                System.out.println("Dias restantes:"+(SEPTIEMBRE-this.getDia()+OCTUBRE+NOVIEMBRE+DICIEMBRE));
                break;
            case 10:
                System.out.println("Dias restantes:"+(OCTUBRE-this.getDia()+NOVIEMBRE+DICIEMBRE));
                break;
            case 11:
                System.out.println("Dias restantes:"+(NOVIEMBRE-this.getDia()+DICIEMBRE));
                break;
            case 12:
                System.out.println("Dias restantes:"+(DICIEMBRE-this.getDia()));
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
