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
public class CertificateOfDeposit {
    private Integer NumeroS;
    private String Apellido;
    private Integer Saldo;
    private Integer FechaE;  

    public CertificateOfDeposit(Integer NumeroS, String Apellido, Integer Saldo,Integer FechaE) {
        this.NumeroS = NumeroS;
        this.Apellido = Apellido;
        this.Saldo = Saldo;
        this.FechaE = FechaE;
    }

    public String convertir(Integer x){
        return String.format("%d/%d/%d",(x-x%10000)/10000,(x-(x-(x%10000)))/100,x%100);
    }
    public String TestCertificateOfDeposit(){
        return String.format("Numero de certificado:%d\nApellido:%s\nSaldo:%d\nFecha de emisión:%s\nFecha de vencimiento:%s",this.getNumeroS(),this.getApellido(),this.getSaldo(),convertir(this.getFechaE()),this.convertir(this.getFechaE()+1));
    }
    public Integer getNumeroS() {
        return NumeroS;
    }

    public void setNumeroS(Integer NumeroS) {
        this.NumeroS = NumeroS;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getSaldo() {
        return Saldo;
    }

    public void setSaldo(Integer Saldo) {
        this.Saldo = Saldo;
    }

    public Integer getFechaE() {
        return FechaE;
    }

    public void setFechaE(Integer FechaE) {
        this.FechaE = FechaE;
    }  
    
    
}
