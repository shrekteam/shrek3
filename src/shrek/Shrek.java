


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrek;

import byui.cit260.shrek.model.Adversary;
import byui.cit260.shrek.model.Pathway;
import byui.cit260.shrek.model.Player;
import byui.cit260.shrek.model.Target;
import byui.cit260.shrek.model.Weapon;

/**
 *
 * @author bruno
 */
public class Shrek {

    /**
     * @param args the command line arguments
     */
    
    private static void BrunoTestPlayer(){
        Player playerOne = new Player();
        playerOne.setName("Shrek2");
        playerOne.setBestTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    } 
    private static void BrunoTestWeapon(){
        Weapon weaponOne = new Weapon();
        weaponOne.setName("excalibur");
        weaponOne.setDimension(12.1);
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);   
    }
    private static void BrunoTestTarget(){
        Target targetOne = new Target();
        targetOne.setName("Fiona");
        targetOne.setHorizontalPosition(10.0);
        targetOne.setVerticalPosition(11.0);
        String targetInfo = targetOne.toString();
        System.out.println(targetInfo); 
    }
    private static void BrunoTestAdversary(){
        Adversary adversaryOne = new Adversary();
        adversaryOne.setName("Soldier");
        adversaryOne.setStrength(4);
        String adversaryInfo = adversaryOne.toString();
        System.out.println(adversaryInfo); 
        
    }
    private static void BrunoTestPathway(){
        Pathway pathwayOne = new Pathway();
        pathwayOne.setName("Bridge9");
        pathwayOne.setDimension(100.0);
        String pathwayInfo = pathwayOne.toString();
        System.out.println(pathwayInfo); 
        
    }        
    public static void main(String[] args) {
        // TODO code application logic here
        BrunoTestPlayer();
        BrunoTestWeapon();
        BrunoTestTarget();
        BrunoTestAdversary(); 
        BrunoTestPathway();
        
    }
    
}
