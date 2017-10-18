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
public class Item {
    private int id;
    private String name ="";
    private int cost;
    private double weight;

public Item(){
    name="unknown";
}    
public Item(int i,String n,int c,double w){
    id=i;
    name=n;
    cost=c;
    weight=w;
}

public int getItemID(){
    return id;
}
public void setItemID(int newID){
    id=newID;
}

public String getName(){
    return name;
}
public void setName(String newName){
    name=newName;
}

public int getCost(){
    return cost;
}
public void setCost(int newCost){
    cost=newCost;
}

public double getWeight(){
    return weight;
}
public void setWeight(double newWeight){
    weight=newWeight;
}

public String toString(){
    return "Item: "+name+" Cost: "+cost+"gp "+"Weight: "+weight+"lbs";
}
}

