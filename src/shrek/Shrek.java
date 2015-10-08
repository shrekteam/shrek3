


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrek;

import byui.cit260.shrek.model.Adversary;
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
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Shrek");
        playerOne.setBestTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        Weapon weaponOne = new Weapon();
        weaponOne.setName("excalibur");
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);   
        Target targetOne = new Target();
        targetOne.setName("Fiona");
        String targetInfo = targetOne.toString();
        System.out.println(targetInfo); 
        Adversary adversaryOne = new Adversary();
        adversaryOne.setName("Soldier");
        String adversaryInfo = adversaryOne.toString();
        System.out.println(adversaryInfo); 
        
    }
    
}
