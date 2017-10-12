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
public class Melee extends Item {
    private int str;
    private int sta;

    public Melee(){
        super();
    }

    public Melee(int id,String name,int cost,double weight, int strength, int stamina){
        super(id,name,cost,weight);
        str = strength;
        sta = stamina;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
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
                "\nThrown: "+getThrown()+
                "\nReach: "+getReach();
    }
}
