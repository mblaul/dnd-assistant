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
public class Melee extends Weapon {
    private boolean thrown;
    private boolean reach;
public Melee(){
    super();
}

public Melee(String name,int cost,double weight, int damageType,int dieType,
              int numDies,int handed,boolean martial,boolean light,boolean heavy,
              boolean finesse,boolean silvered,boolean th,boolean re){
    super(name,cost,weight,damageType,dieType,numDies,handed,martial,light,
            heavy,finesse,silvered);
            thrown=th;
            reach=re;
}
public boolean getThrown(){
    return thrown;
}
public void setThrown(boolean newThrown){
    thrown=newThrown;
}
public boolean getReach(){
    return reach;
}
public void setReach(boolean newReach){
    reach=newReach;
}
@Override
public String toString(){
    return "Item: "+getName()+
            "\nCost: "+getCost()+"gp"+
            "\nWeight: "+getWeight()+"lbs"+
            "\nWielded: "+getNumHand()+
            "\nMartial weapon: "+ getMartial()+
            "\nLight: "+getLight()+
            "\nHeavy: "+getHeavy()+
            "\nFinesse: "+getFinesse()+
            "\nSilvered: "+getSilvered()+
            "\nDamage Type: "+
            getNumDies()+"d"+getDieType()+" "+getDMGtype()+" damage"+
            "\nThrown: "+getThrown()+
            "\nReach: "+getReach();
}
}
