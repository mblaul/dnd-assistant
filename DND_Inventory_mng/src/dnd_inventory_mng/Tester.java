/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd_inventory_mng;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matt
 */
public class Tester {
    public static void main(String[] args){
        InventoryList reader = new InventoryList();
        reader.buildInventoryList();

    List<Item> itemList = new ArrayList<Item>();
    List<Armor> armorItemList = new ArrayList<Armor>();
    List<Melee> meleeItemList = new ArrayList<Melee>();
    List<Ranged> rangedItemList = new ArrayList<Ranged>();
    List<Potion> potionItemList = new ArrayList<Potion>();
    List<Adventure> adventureItemList = new ArrayList<Adventure>();
        
    //Build master inventory list using a method from the InventoryList class
        InventoryList masterInventory = new InventoryList();
        masterInventory.buildInventoryList(armorItemList,meleeItemList,rangedItemList,
                                  potionItemList,adventureItemList);
        
        System.out.println(rangedItemList.get(1).getAttack());
    
    }
    
}
