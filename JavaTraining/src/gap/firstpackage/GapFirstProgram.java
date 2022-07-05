package gap.firstpackage;

import gap.bocanc.Bocanc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * This is the first class written for the Java Training.
 * @author gheorgheaurelpacurar
 */
public class GapFirstProgram {

    /**
     * This is the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define an int variable
        int i = 10; 
        int j = 12;
        // Create a Bocanc
        Bocanc acestBocanc = new Bocanc();
        System.out.println("The content of my first variable i: "+i);
        acestBocanc.mesaj();
        // testing operators on int variables
        int k = i =+ j;
        System.out.println("i =+ j is " + k +" where i =" +i + " and j="+j);
        k = 12;
        int l = 0;
        // testing instance of
        boolean esteUnObiectDeTipul;
        esteUnObiectDeTipul = acestBocanc instanceof Object;
        System.out.println("acestBocanc este un obiect din clasa Bocanc: "+esteUnObiectDeTipul);
        // testing (?:)
        l = i++ - k-- + j;
        System.out.println(  );
        System.out.println("Five");
        System.out.println("Six or 6 :)");
        System.out.println("last line of program");
    }
    
}
