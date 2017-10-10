/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

/**
 *
 * @author duroj
 */
public class DND_Inventory_mng {

    /**
     * @param args the command line arguments
     * 
     *Weapon traits
     *name
     *cost
     *weight
     *damageType; > 0=piercing,1=slashing,2=bludgeoning
     *dieType;
     *numDies;
     *handed; /*0=1handed,1=2handed,2=versatile
     *martial;
     *light;
     *heavy;
     *finesse;
     *silvered;
     * 
     * Ranged only
     * AmmoType; > 1=arrows,2=bolts,3=stones
     * Ammunition(amount default 0)
     * MinRange
     * MaxRange
     * loaded(status default false)
     * 
     * Melee only
     * thrown
     * reach
     */
    public static void main(String[] args) {
        Item weapon1 =new Melee("dagger",2,1,0,4,1,0,false,true,false,true,false,true,false);
        Item weapon2 =new Ranged("shortbow",25,2,0,6,1,1,false,false,false,false,false,1,0,80,320,false);
        System.out.println(weapon1.toString());
        System.out.println(weapon2.toString());
    }
    
}
