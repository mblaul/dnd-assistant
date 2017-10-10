/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

/**
 *
 * @author Mary
 */
public class Armor extends Item{
    private boolean light;
    private boolean medium;
    private boolean heavy;
    private int armorClass;
    
   public Armor(){
        super();
    }
    public Armor(String name,int cost,double weight,boolean l, boolean m, 
            boolean hv, int ac){
        super(name,cost,weight);
        light=l;
        medium=m;
        heavy=hv;
        armorClass=ac;
    }
        
    public boolean getLight(){
        return light;
    }
    public void setLight(boolean newLight){
        light=newLight;
    }

    
    public boolean getMedium(){
        return medium;
    }
    public void setMedium(boolean newMedium){
        medium=newMedium;
    }
    
    
    
    public boolean getHeavy(){
        return heavy;
    }
    public void setHeavy(boolean newHeavy){
        heavy=newHeavy;
    }
    
    public int getArmorClass(){
        return armorClass;
    }
    public void setArmorClass(int newArmorClass){
        armorClass = newArmorClass;
    }
}

