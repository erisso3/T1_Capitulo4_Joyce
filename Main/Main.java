package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import capitulo4.FormLetterWriter;
import capitulo4.Billing;
import capitulo4.BirdSighting;
import capitulo4.BirdSighting2;
import capitulo4.BloodType;
import capitulo4.Bread;
import capitulo4.Breadtype;
import capitulo4.CertificateOfDeposit;
import capitulo4.Circle;
import capitulo4.Estados;
import capitulo4.Factor;
import capitulo4.MathTest;
import capitulo4.NextMonth;
import capitulo4.Paciente;
import capitulo4.Sandwich;
import capitulo4.SandwichFilling;
import capitulo4.State;
import capitulo4.YearEnd;
import capitulo4.fillingtype;
/**
 *
 * @author eriss
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        FormLetterWriter fw=new FormLetterWriter();
        System.out.println(fw.displaySalutation("Mitchell"));
        System.out.println(fw.displayString("Erick","Echeverria"));
        System.out.println("\nEjercicio 2");
        Billing b=new Billing();
        System.out.println(b.computeBill(10));
        System.out.println(b.computeBill(10,2));
        System.out.println(b.computeBill(10,2,3));
        System.out.println("\nEjercicio 3");
        BirdSighting bs=new BirdSighting();
        System.out.println(bs.TestBirdSighting());
        BirdSighting bss=new BirdSighting("Loro",5 ,2);
        System.out.println(bss.TestBirdSighting());
        BirdSighting2 bs2=new BirdSighting2(bss);
        System.out.println(bs2.TestBirdSighting2());
        System.out.println("\nEjercicio 4");
        Paciente p=new Paciente(333,19, BloodType.A, Factor.POSITIVO);
        System.out.println(p.toString());
        System.out.println("\nEjercicio 5");
        System.out.println("A)");
        Bread br=new Bread(7, Breadtype.trigo);
        System.out.println(br.TestBread());
        Bread br2=new Bread((float)3.2, Breadtype.blanco);
        System.out.println(br2.TestBread());
        Bread br3=new Bread((float)4.33, Breadtype.trigo);
        System.out.println(br3.TestBread());
        System.out.println("B)");
        SandwichFilling sa=new SandwichFilling(fillingtype.huevo,(float)2.3);
        System.out.println(sa.TestSandwichFilling());
        SandwichFilling sa2=new SandwichFilling(fillingtype.queso,(float)2.33);
        System.out.println(sa2.TestSandwichFilling());
        SandwichFilling sa3=new SandwichFilling(fillingtype.carne,(float)12.43);
        System.out.println(sa3.TestSandwichFilling());
        System.out.println("C)");
        Sandwich sw=new Sandwich((float)5.73, Breadtype.blanco, fillingtype.huevo,(float)9.33);
        System.out.println(sw.TestSandwich());
        System.out.println("\nEjercicio 6");
        Circle c=new Circle();
        System.out.println(c.Area());
        System.out.println(c.Diametro());
        System.out.println("\nEjercicio 7");
        MathTest mt=new MathTest();
        System.out.println(mt.toString());
        System.out.println("\nEjercicio 8");
        NextMonth nm=new NextMonth(10,9);
        nm.GregorianCalendar();
        System.out.println("\nEjercicio 9");
        YearEnd ye=new YearEnd(10,9);
        ye.GregorianCalendar();
        System.out.println("\nEjercicio 10");
        CertificateOfDeposit co=new CertificateOfDeposit(4523,"Echeverria", 33333,101197);
        System.out.println(co.TestCertificateOfDeposit());
        System.out.println("\nEjercicio 11");
        State s=new State(Estados.Oaxaca,2344245,"Oaxaca","Zimatlan","San Pablo", 434);
        System.out.println(s.TestState());
    }
}
