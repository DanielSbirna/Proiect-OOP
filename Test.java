/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.boxa;
/**
 *
 * @author danie
 */
public class Test {
    
    public static void main(String[] args) {
        Boxa boxa1 = new Boxa();
        Boxa boxa2 = new Boxa(true, false, "500", "20", "2", "Akai", true, "1", "Negru", 1.5 );
        Boxa boxa3 = new Boxa (boxa2);

        Casti casca1 = new Casti();
        Casti casca2 = new Casti (true, "5.4", true, true, "10", "Philips", true, "2", "roz", 0.50);
        Casti casca3 = new Casti (casca2);


        System.out.println(boxa1);
        System.out.println(boxa2);
        System.out.println(boxa3);

        System.out.println(casca1);
        System.out.println(casca2);
        System.out.println(casca3);
        
        //Vector
        
        Boxa[] boxa = new Boxa[10];
        for (int i = 0; i <boxa.length; i++) {
            boxa[i] = new Boxa(i % 2 == 0, i % 3 == 0, (i + 1) * 1000 + " mA", (i + 1) * 10 + " m", (i + 1) + " h", "Marca " + i, true, "1 an " + i, "Culoare " + i, i*0.5);
            //RezistentApa, RezistentPraf, CapacitateAcumulator, DistenataOperare, TimpIncarcare, Marca, Garantie, TermenGarantie, Culoare, Greutate
        }
        
        Casti[] casca = new Casti[10];
        for (int j = 0; j<casca.length; j++) {
            casca[j] = new Casti( true, "v" + (5.0 + (j*0.1)), j % 2 == 0, true, (j + 1) * 2 + " h", "Marca " + (j + 10), true, "6 luni ", "Culoare " + (j + 10) ,j*0.2 );
            //AreBluetooth, VersiuneBluetooth, AsistentVocal, InEar, Autonomie, Marca, Garantie, TermenGarantie, Culoare, Greutate
        }
        
        //Print Boxa[]
        
        System.out.println("Boxa array");
        for (int i = 0; i<boxa.length; i++){
            System.out.println(boxa[i].toString());
        }

        //Print Casti[]
        
        System.out.println("Casti array");
        for (int j = 0; j<casca.length; j++){
            System.out.println(casca[j].toString());
        }
       
        System.out.println("Test Functii");
        
        PrintAllBoxaRezistentPrafRezistentApa(boxa, true, false);
        PrintAllCastiAreBluetoothAsistentVocal(casca, true, false);
    }
    
    public static void PrintAllBoxaRezistentPrafRezistentApa(Gadget[] array,  boolean RezistentPraf, boolean RezistentApa){
            for(Gadget j : array){ //ia pe rand fiecare obiect din array ca fiind j
                if(j instanceof Boxa){ //instaceof = verifica j este Boxa
                   Boxa b = (Boxa) j; 
                   if(b.RezistentPraf() == RezistentPraf && b.RezistentApa() == RezistentApa){
                       System.out.println(b);
                   }
                }
            }
    }
    
    public static void PrintAllCastiAreBluetoothAsistentVocal(Gadget[] array,  boolean AreBluetooth, boolean AsistentVocal){
            for(Gadget j : array){
                if(j instanceof Casti){
                   Casti b = (Casti) j;
                   if(b.AreBluetooth() == AreBluetooth && b.AsistentVocal() == AsistentVocal){
                       System.out.println(b);
                   }
                }
            }
    }
}
