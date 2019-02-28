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
public class MathTest {
    private static Integer A;
    private static Integer B;
    private static float C;
    private static Character D;
    
    public MathTest(){
        this.A=37;
        this.B=300;
        this.C=(float)22.8;
        this.D='D';
    }

    public float EjercicioA(){
        return (float)Math.sqrt(this.A);
    }
    
    public float EjercicioBC(){
        return (float)Math.cos(B);
    }

    public float EjercicioBS(){
        return (float)Math.sin(B);
    }
    
    public double EjercicioFC(){
        return Math.floor(C);
    }
    
     public double EjercicioCC(){
        return Math.ceil(C);
    }
    public String EjercicioD(){
        if((int)D>71){
            return String.format("El %s(%d) es mayor que 71",this.D,(int)D);
        }else{
            return String.format("El 71 es mayor que %s(%d)",this.D,(int)D);
        }
    }
    
    
    public Integer EjercicioE(){
        return (int)(Math.random()*20);
    }
    
    public String toString(){
        return String.format("A):%.2f\nB):Cos %.2f Sen %.2f\nC):Floor %.2f Ceil %.2f\nD)%s\nE)%d",this.EjercicioA(),this.EjercicioBC(),this.EjercicioBS(),this.EjercicioFC(),this.EjercicioCC(),this.EjercicioD(),this.EjercicioE());
    }
    
}
