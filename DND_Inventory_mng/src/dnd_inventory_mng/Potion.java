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
public class Potion extends Item {
  
    private int mod;
    private String attr;

    public Potion(){
        super();
    }

    public Potion(int id,String name,int cost,double weight,int modifier, String attribute){
        super(id,name,cost,weight);
        mod = modifier;
        attr = attribute;
    }

    public int getModifier() {
        return mod;
    }

    public void setModifier(int mod) {
        this.mod = mod;
    }

    public String getAttribute() {
        return attr;
    }

    public void setAttribute(String attribute) {
        this.attr = attribute;
    }


    @Override
    public String toString(){
        return "Item: "+getName()+
                "\nCost: "+getCost()+"gp"+
                "\nWeight: "+getWeight()+"lbs";
    }
}
