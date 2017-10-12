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
public class Ranged extends Item {
    private int rng;
    private int sta;

    public Ranged(){
        super();
    }

    public Ranged(int id,String name,int cost,double weight, int range, int stamina){
        super(id,name,cost,weight);
        rng = range;
        sta = stamina;
    }

    public int getRange() {
        return rng;
    }

    public void setRange(int rng) {
        this.rng = rng;
    }

    public int getStamina() {
        return sta;
    }

    public void setStamina(int sta) {
        this.sta = sta;
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

