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
public class Armor extends Item {
    private int def;

    public Armor(){
        super();
    }

    public Armor(int id,String name,int cost,double weight,int defense){
        super(id,name,cost,weight);
        def = defense;
    }

    public int getDefense() {
        return def;
    }

    public void setDefense(int def) {
        this.def = def;
    }

    


    @Override
    public String toString(){
        return "Item: "+getName()+
                "\nCost: "+getCost()+"gp"+
                "\nWeight: "+getWeight()+"lbs";
    }
}
