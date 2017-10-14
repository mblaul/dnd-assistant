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
    private int str;
    private int sta;

    public Melee(){
        super();
    }

    public Melee(int id,String name,int cost,double weight,int attack, int strength, int stamina){
        super(id,name,cost,weight,attack);
        str = strength;
        sta = stamina;
    }

    public int getStrength() {
        return str;
    }

    public void setStrength(int str) {
        this.str = str;
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
                "\nWeight: "+getWeight()+"lbs";
    }
}
