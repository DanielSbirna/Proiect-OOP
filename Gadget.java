/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.aciee.boxa;

/**
 *
 * @author danie
 */
public class Gadget {
    String Marca;
    boolean Garantie;
    String TermenGarantie;
    String Culoare;
    double Greutate;

    public Gadget (String Marca, boolean Garantie, String TermenGarantie, String Culoare, double Greutate) {
        this.Marca = Marca;
        this.Garantie = Garantie;
        this.TermenGarantie = TermenGarantie;
        this.Culoare = Culoare;
        this.Greutate = Greutate;
    }
    
    public Gadget () {
        Marca = "Nedefinit";
        Garantie = true;
        TermenGarantie = "2 ani";
        Culoare = "Nedefinit";
        Greutate = 0;
    }
    
    public Gadget (Gadget other) {
        this.Marca = other.Marca;
        this.Garantie = other.Garantie;
        this.TermenGarantie = other.TermenGarantie;
        this.Culoare = other.Culoare;
        this.Greutate = other.Greutate;
    }
    
   
    
    public void porneste() {
        System.out.println("Gadgetul " + Marca + " a fost pornit.");
    }
    

    public void opreste(){
         System.out.println("Gadgetul " + Marca + " a fost oprit.");
    }
    
    @Override
    
    public String toString(){
        return "Gadgetul " + Marca + " cu garantie " + Garantie + " pe termen de " + TermenGarantie + " culoare " + Culoare + " si cu o greutate de " + Greutate;
    }
    
}
