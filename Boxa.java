package ro.ugal.aciee.boxa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Boxa extends Gadget {
    private boolean RezistentApa;
    private boolean RezistentPraf;
    private String CapacitateAcumulator;
    private String DistantaOperare;
    private String TimpIncarcare;
    
    public Boxa(boolean RezistentApa , boolean RezistentPraf , String CapacitateAcumulator , String DistantaOperare , String TimpIncarcare, String Marca, boolean Garantie, String TermenGarantie, String Culoare, double Greutate) {
       //apelare constructor parinte;
       super(Marca, Garantie, TermenGarantie, Culoare, Greutate);  
       this.RezistentApa = RezistentApa;
       this.RezistentPraf = RezistentPraf;
       this.DistantaOperare = DistantaOperare;
       this.CapacitateAcumulator = CapacitateAcumulator;
       this.TimpIncarcare = TimpIncarcare;
        
    }
    
    public Boxa() {
        //apelare constructor implcit parinte;
        super();
        RezistentApa = false;
        RezistentPraf = true;
        CapacitateAcumulator = "4800 mA";
        DistantaOperare = "200 m";
        TimpIncarcare = "4 h";
    }
    
    public Boxa (Boxa other) {
        //apelare contructor de copiere parinte;
        super(other.Marca, other.Garantie, other.TermenGarantie, other.Culoare, other.Greutate);
        this.RezistentApa = other.RezistentApa;
        this.RezistentPraf = other.RezistentPraf;
        this.CapacitateAcumulator = other.CapacitateAcumulator;
        this.DistantaOperare = other.DistantaOperare;
        this.TimpIncarcare = other.TimpIncarcare;
    }
    
    //Get
    
    public boolean RezistentApa() {
        return RezistentApa;
    }
    
    public boolean RezistentPraf() {
        return RezistentPraf;
    }
    
    public String CapacitateAcumulator() {
        return CapacitateAcumulator;
    }
    
    public String DistantaOperare() {
        return DistantaOperare;
    }
    
    public String TimpIncarcare() {
        return TimpIncarcare;
    }
    
    //Set
    
    public void setRezistentApa (boolean RezistentApa) {
        this.RezistentApa = RezistentApa;
    } 
    
    public void setRezistentPraf (boolean RezistentPraf) {
        this.RezistentPraf = RezistentPraf;
    }
    
    public void setCapacitateAcumulator(String CapacitateAcumulator) {
        this.CapacitateAcumulator = CapacitateAcumulator;
    }
    
    public void setDistantaOperare(String DistantaOperare){
        this.DistantaOperare = DistantaOperare;
    }
    
    public void setTimpIncarcare(String TimpIncarcare){
        this.TimpIncarcare = TimpIncarcare;
    }
    
    @Override
    
    public String toString(){
        return super.toString() + " rezistenta la apa " + RezistentApa + " rezistent la praf " + RezistentPraf + " cu o distanta de operare de " + DistantaOperare + " capacitatea acumulator " + CapacitateAcumulator + " care se incarca in " + TimpIncarcare;
    }

}
