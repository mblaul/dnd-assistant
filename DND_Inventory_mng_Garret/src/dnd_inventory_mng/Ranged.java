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
public class Ranged extends Weapon {
    private int ammoType;
    private int ammunition;
    private int rangeMin;
    private int rangeMax;
    private boolean loaded;
    private String AmType="";
public Ranged(){
    super();
}

public Ranged(String name,int cost,double weight, int damageType,int dieType,
              int numDies,int handed,boolean martial,boolean light,boolean heavy,
              boolean finesse,boolean silvered,int at,int am,int rngMn,int rngMx, boolean ld){
    super(name,cost,weight,damageType,dieType,numDies,handed,martial,light,
            heavy,finesse,silvered);
    ammoType=at;
    ammunition=am;
    rangeMin=rngMn;
    rangeMax=rngMx;
    loaded=ld;
}
public int getAmmoType(){
    return ammoType;
}
public void setAmmoType(int newAT){
    ammoType=newAT;
}
public int getAmmunition(){
    return ammoType;
}
public void setAmmunition(int newAM){
    ammunition=newAM;
}
public int getRangeMin(){
    return rangeMin;
}
public void setRangeMin(int newRNGmn){
    rangeMin=newRNGmn;
}
public int getRangeMax(){
    return rangeMax;
}
public void setRangeMax(int newRNGmx){
    rangeMax=newRNGmx;
}
public boolean getLoaded(){
    return loaded;
}
public void setLoaded(boolean newLD){
    loaded=newLD;
}
public String getAmType(){
    switch(ammoType){
        case 1: AmType="arrows";
        break;
        case 2: AmType="bolts";
        break;
        case 3: AmType="stones";
        break;
    }
    return AmType;
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
            "\nAmmunition Type: "+getAmType()+
            "\nRange- Minimum: "+getRangeMin()+" Maximum: "+getRangeMax();
}
}

