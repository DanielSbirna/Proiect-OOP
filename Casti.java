package ro.ugal.aciee.boxa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Casti extends Gadget {
    private boolean AreBluetooth;
    private String VersiuneBluetooth;
    private boolean AsistentVocal;
    private boolean InEar; 
    private String Autonomie;
    
    public Casti (boolean AreBluetooth, String VersiuneBluetooth, boolean AsistentVocal, boolean InEar, String Autonomie, String Marca, boolean Garantie, String TermenGarantie, String Culoare, double Greutate) {
        //apelare constructor parinte;
        super(Marca, Garantie, TermenGarantie, Culoare, Greutate); 
        this.AreBluetooth = AreBluetooth;
        this.VersiuneBluetooth = VersiuneBluetooth;
        this.AsistentVocal = AsistentVocal;
        this.InEar = InEar;
        this.Autonomie = Autonomie;
    }
    
    public Casti () {
        //apelare constructor implicit parinte;
        super();
        AreBluetooth = true;
        VersiuneBluetooth = "5.3";
        AsistentVocal = false;
        InEar = true;
        Autonomie = "5 h";
    }
    
    public Casti (Casti other) {
        //apelare contructor de copiere parinte;
        super(other.Marca, other.Garantie, other.TermenGarantie, other.Culoare, other.Greutate);
        this.AreBluetooth = other.AreBluetooth;
        this.VersiuneBluetooth = other.VersiuneBluetooth;
        this.AsistentVocal = other.AsistentVocal;
        this.InEar = other.InEar;
        this.Autonomie = other.Autonomie;
        
    }
    
    //Get
    
    public boolean AreBluetooth() {
        return AreBluetooth;
    }
    
    public String VersiuneBluetooth() {
        return VersiuneBluetooth;
    }
    
    public boolean AsistentVocal() {
        return AsistentVocal;
    }
    
    public boolean InEar() {
        return InEar;
    }
    
    public String Autonomie() {
        return Autonomie;
    }
    
    //Set
    
    public void setAreBluetooth (boolean AreBluetooth) {
        this.AreBluetooth = AreBluetooth;
    } 
    
    public void setVersiuneBluetooth (String VersiuneBluetooth) {
        this.VersiuneBluetooth = VersiuneBluetooth;
    }
    
    public void setAsistentVocal(boolean AsistentVocal) {
        this.AsistentVocal = AsistentVocal;
    }
    
    public void setInEar(boolean InEar){
        this.InEar = InEar;
    }
    
    public void setAutonomie(String Autonomie){
        this.Autonomie = Autonomie;
    }
    
    @Override
    
    public String toString (){
        return super.toString() + " Are bluetooth " + AreBluetooth + " cu versiunea " + VersiuneBluetooth + " are asistent vocal " + AsistentVocal + " casti de tip in-ear " + " cu autonomia de " + Autonomie;
    }
     
}
